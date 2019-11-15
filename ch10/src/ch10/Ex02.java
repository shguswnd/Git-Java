package ch10;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02 extends JFrame{
	Ex02(){
		setTitle("�巡�뵿�� Yellow");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel cp = new JPanel();
		setContentPane(cp);
		cp.setBackground(Color.green);
		setVisible(true);
		cp.addMouseMotionListener(new MyMotion());
		}
	class MyMotion implements MouseMotionListener{//����Ʈ ��Ʈ s �� v �ڵ� �������̵�

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			JPanel j = (JPanel)e.getSource();
			j.setBackground(Color.yellow);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			JPanel j = (JPanel)e.getSource();
			j.setBackground(Color.green);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

}
