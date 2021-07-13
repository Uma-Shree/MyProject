import java.awt.*;
import javax.swing.*;
import javafx.application.Application.*;
public class JButtonDemo extends JFrame
{
JButton jb1=new JButton("Click Me");
JLabel jl1=new JLabel("Welcome to Swing");
JButtonDemo()
{
setVisible(true);
setSize(800,400);
jb1.setBounds(50,100,200,50);
getContentPane().add(jl1);
getContentPane().add(jb1);
}
public static void main(String ar[])
{
JButtonDemo jb=new JButtonDemo();
}
}
