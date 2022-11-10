package javaProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerEx2 extends JFrame {
	private JLabel la = new JLabel("Hello");
	public MouseListenerEx2() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter {
		//마우스 어뎁터 클래스 이용
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	public static void main(String [] args) {
		new MouseListenerEx2();
	}
}