import java.awt.*;
import javax.swing.*;
import javafx.application.Application.*;
public class JLabelDemo extends JFrame
{
//JButton jb1=new JButton("Click Me");
JLabel jl1=new JLabel("Welcome to Swing");
JLabelDemo()
{
setVisible(true);
setSize(800,400);
jl1.setBounds(50,100,100,50);
getContentPane().add(jl1);
//getContentPane().add(jb1);
}
public static void main(String ar[])
{
JLabelDemo jl=new JLabelDemo();
}
}
