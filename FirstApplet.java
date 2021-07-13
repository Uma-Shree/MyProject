import java.awt.*;
import java.util.*;
import java.applet.Applet.*;
import javax.swing.*;
import java.awt.event.*;
public class FirstApplet extends JApplet implements Runnable,ActionListener
{
int  Ovx1,Ovx2,Ovy1,Ovy2;
JButton Jb1,Jb2;
FlowLayout fl=new FlowLayout();
JButton starb,blankb;
	public FirstApplet()
	{
ImageIcon ic=new ImageIcon("SmallStar1.jpg");
ImageIcon icb=new ImageIcon("BlankStar1.jpg");
starb=new JButton(" ",ic);
blankb=new JButton(" ",icb);
//starb.setIconImage(ic);
setLayout(fl);
Jb1=new JButton("INVISIBLE");
Jb2=new JButton("RESTART");
Jb1.setBounds(800,1000,50,20);
Jb2.setBounds(200,800,50,20);
getContentPane().add(Jb1);
getContentPane().add(Jb2);
Jb1.addActionListener(this);
getContentPane().add(starb);
getContentPane().add(blankb);
setVisible(true);
setSize(3000,2500);


	}
	public void init()
	{
	}
	public void start()
	{
	}
	public void paint(Graphics g)
	{

Ovx1=245;
Ovy1=145;
Ovx2=205;
Ovy2=210;

g.drawString("hello everyone",500,40);
g.setColor(Color.red);
g.fillOval(Ovx1,Ovy1,Ovx2,Ovy2);
g.setColor(Color.yellow);

g.fillOval(250,150,200,200);





}
	public void run()
{
}
public void actionPerformed(ActionEvent ae)
{
/*if( ae.getSource==jb1)
{
}*/
}
	public void stop()
	{
	}
	public static void main(String[] ar)
	{
		//System.out.println("Omi Welcome you always in the world of MyApplet");
    FirstApplet fa=new FirstApplet();
	}

}