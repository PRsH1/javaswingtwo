package javaProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerAllEx extends JFrame {
	
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListenerAllEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener myMouseListener = new MyMouseListener();
		//���콺 ������ ��ü ����
		c.addMouseListener(myMouseListener);
		c.addMouseMotionListener(myMouseListener);
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener,MouseMotionListener {
		//�������̽� ���콺������ ��Ǹ����ʸ� ���̽��� �� ���̸��콺������ Ŭ����
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + ", " + e.getY()
			+ ")");
			//���콺�� ���� �ÿ� x,y��ǥ�� ���콺 �����ٴ� �޽��� ���
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + ", " + e.getY()
			+ ")");
			//���콺 ������ �� x,y��ǥ�� ������ �޼��� ���
		}
		public void mouseClicked(MouseEvent e) {}
		//Ŭ�� �߻� �޼ҵ�
		public void mouseEntered(MouseEvent e) {
			//���콺�� �г� �ȿ� ����
			Component c = (Component) e.getSource();
			c.setBackground(Color.CYAN);
			//���콺 �г� �ȿ� ���� �� ���� cyan������ �ٲ�
		}
		public void mouseExited(MouseEvent e) {
			//���콺 �г� �ƿ�
			Component c = (Component) e.getSource();
			c.setBackground(Color.YELLOW);
			//���콺 �������� �� �÷� ��������� 
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + ", " + e.getY()
			+ ")");
			//���콺 �巡�� �� x,y��ǥ�� �巡�� �޽��� ���
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + ", " + e.getY()
			+ ")");
			//���콺 ������ �� �����δٴ� �޼����� x,y��ǥ ���
		}
	}
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}