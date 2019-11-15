package ch10;

import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

public class Ex06 extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la;
	
	Ex06(){
		setTitle("Mouns 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
		la = new JLabel("c");
		la.setSize(50,20);
		la.setLocation(100,100);
		contentPane.add(la);
		setSize(300,300);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {//마우스 버튼이 눌렸는가 확인
			// TODO Auto-generated method stub
			int x = (int)Math.round(Math.random()*299+1);
			int y = (int)Math.round(Math.random()*299+1);
			la.setLocation(x,y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}
