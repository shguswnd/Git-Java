package ch09;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;


public class Ex04 extends JFrame{
	Ex04(){
		setTitle("Ten Color Buttons Frame");
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i=0;i<10;i++) {
			Color[] col = {
					Color.RED,Color.orange,Color.yellow,Color.green,
					Color.cyan,Color.blue,Color.magenta,Color.gray,
					Color.pink,Color.LIGHT_GRAY
			};
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.setOpaque(true);//반투명하게 페이튼가 되어있지않게 해주어 페인트를 시켜줄수있다.
			b.setBackground(col[i]);
			c.add(b);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
