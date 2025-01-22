package HW9_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.math.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame
{
    public MyFrame()
    {
        setTitle("여러 개의 패널을 가진 프레임"); // 프레임의 타이틀 달기
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(),BorderLayout.NORTH); // North 패널 추가
        c.add(new CenterPanel(),BorderLayout.CENTER); // Center 패널 추가
        c.add(new SouthPanel(),BorderLayout.SOUTH); // South 패널 추가

        setSize(400,400);
        setVisible(true);

    }
}

class NorthPanel extends JPanel // North에 부착할 패널
{
    public NorthPanel()
    {
        setBackground(Color.GRAY);
        this.add(new JButton("열기"));
        this.add(new JButton("닫기"));
        this.add(new JButton("나가기"));
    }
}

class CenterPanel extends JPanel // CENTER에 부착할 패널
{
    public CenterPanel()
    {
        this.setLayout(null); // 배치관리자 삭제

        int x;
        int y;

        JLabel L;


        for(int i=0;i<10;i++)
        {
            x = (int)(Math.random()*300);
            y = (int)(Math.random()*300);

            L = new JLabel("*");
            L.setForeground(Color.red);
            L.setLocation(x, y);
            L.setSize(50,10);


            this.add(L);
        }
    }
}

class SouthPanel extends JPanel // South에 부착할 패널
{
    public SouthPanel()
    {
        this.setLayout(new FlowLayout(FlowLayout.LEFT)); // Flowlayout 배치관리자 부착

        setBackground(Color.yellow);
        this.add(new JButton("Word Input"));
        this.add(new JTextField(24));


    }
}


public class HW_9_8
{
    public static void main(String[] args)
    {
        MyFrame FR = new MyFrame();
        // TODO Auto-generated method stub
    }

}
