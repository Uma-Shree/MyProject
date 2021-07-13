import java.awt.*;
import java.util.*;

public class ButtonDemo extends Frame
{
	Button j1,j2;
	public ButtonDemo()
	{
		j1=new Button("OK");
		j2=new Button("CANCEL");
		add(j1);
		add(j2);
                  //  j1.setBounds(800,500,50,20);
//j2.setBounds(400,500,50,20);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		new ButtonDemo();
	}
}