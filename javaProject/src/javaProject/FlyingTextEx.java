package javaProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");

	public FlyingTextEx() {
		setTitle("FlyingTextEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(0,0);
		//�ؽ�Ʈ ù ���� ��ġ�� 0,0
		la.setSize(100,20);
		la.setBackground(Color.yellow);
		
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		//�׻� setVisible���Ŀ� ȣ��
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener extends KeyAdapter {

		public void keyPressed(KeyEvent e) {

			int keyCode = e.getKeyCode();
			switch(keyCode) {
			//����ġ ��(�����¿� Ű)
			case KeyEvent.VK_UP://�� Ű�� �Է��ϸ�
				la.setLocation(la.getX(), la.getY()-10);
				//��ġ�� y-10��ŭ �̵�
				//ù ���� ��ġ�� �»�� 0,0���� ����� ��
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() -10 ,la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() +10 ,la.getY());
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
