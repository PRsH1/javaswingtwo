package javaProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		setSize(250, 250);
		setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();

	}
	class MyMouseListener implements MouseListener {
		//인터페이스 기반 이벤트 리스너 클래스 구현
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		//추상 메소드를 모두 구현해야함
		//릴리즈 클릭 엔터 익시트 등
	}



}



