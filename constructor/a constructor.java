package constructor;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;

class MyFrame extends JFrame
{
	public MyFrame()
	{
		setTitle("Random Labels");
		setVisible(true);
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(null); // 배치관리자 삭제


		for(int i=0;i<20;i++) //랜덤 위치에 점 배치
		{
			JLabel L = new JLabel();
			int x = (int)(Math.random()*200)+50; // 50~250
			int y = (int)(Math.random()*200)+50; // 50~250


			L.setSize(10,10); // 크기를 10으로 설정
			L.setBackground(Color.BLUE);
			L.setOpaque(true);
			L.setLocation(x,y);

			c.add(L);
		}


	}
}
public class GUI
{

	public static void main(String[] args)
	{
		MyFrame FR = new MyFrame();
		// TODO Auto-generated method stub

	}

}


