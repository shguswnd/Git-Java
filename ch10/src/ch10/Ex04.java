package ch10;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04 extends JFrame{
	String m = new String("Love Java");
	JLabel la = new JLabel(m);
	
	Ex04(){
		JPanel contentPane = new JPanel();
		setTitle("Number 4 !!!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);//����Ʈ�Һ�����
		contentPane.setLayout(new FlowLayout());
		la.addKeyListener(new MykeyListner());
		la.setSize(100,100);
		contentPane.add(la);
		setSize(300,300);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();//��Ŀ�� ���� ��û
	}
	class MykeyListner extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_LEFT:
				m = m.substring(1)+m.substring(0,1);//substring(start)���� ��ġ���� ������ substring(start,end)���ۺ��� ��Ʈ�� 
				la.setText(m);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
