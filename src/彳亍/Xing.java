package 彳亍;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Xing
{
	public static void main(String args[])
	{
		class 彳亍 extends JFrame
		{
			private static final long serialVersionUID = 1L;
			彳亍()
			{
				setLocation(Math.abs(new Random().nextInt()%(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth())-100,Math.abs(new Random().nextInt()%(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight())-60);
				setTitle("彳亍");
				setSize(256,80);
				add(new JButton("彳亍"));
			}
		}
		new Thread()
		{
			@Override
			public void run()
			{
				try{Thread.sleep(61000L);System.exit(0);}catch(Throwable e){}
			}
		}.start();
		for(;;){try{Thread.sleep(200);new 彳亍().setVisible(true);System.out.println("彳亍");}catch(Throwable e){}}
	}
}
