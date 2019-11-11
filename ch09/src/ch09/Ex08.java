package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		for(int i=0;i<10;i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			JLabel label = new JLabel("*");
			label.setForeground(Color.green);//전경색 배경색의 앞부분에 칠할수있음.
			label.setLocation(x,y);
			label.setSize(20,20);
			label.setOpaque(true);
			add(label);
		}
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		add(new JButton("Word Input"));
		add(new TextField(15));
	}
}
public class Ex08 extends JFrame{

	public Ex08() {
		setTitle("여러개의 패널을 가진 프레임");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		NorthPanel np = new NorthPanel();
		CenterPanel cp = new CenterPanel();
		SouthPanel sp = new SouthPanel();
		add(np,BorderLayout.NORTH);
		add(sp,BorderLayout.SOUTH);
		add(cp);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08();
	}

}
