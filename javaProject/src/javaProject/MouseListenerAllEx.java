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
		//마우스 리스너 객체 생성
		c.addMouseListener(myMouseListener);
		c.addMouseMotionListener(myMouseListener);
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener,MouseMotionListener {
		//인터페이스 마우스리스너 모션리스너를 베이스로 한 마이마우스리스너 클래스
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + ", " + e.getY()
			+ ")");
			//마우스를 누를 시에 x,y좌표와 마우스 눌렀다는 메시지 출력
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + ", " + e.getY()
			+ ")");
			//마우스 릴리즈 시 x,y좌표와 릴리즈 메세지 출력
		}
		public void mouseClicked(MouseEvent e) {}
		//클릭 추상 메소드
		public void mouseEntered(MouseEvent e) {
			//마우스가 패널 안에 들어옴
			Component c = (Component) e.getSource();
			c.setBackground(Color.CYAN);
			//마우스 패널 안에 진입 시 색깔 cyan색으로 바꿈
		}
		public void mouseExited(MouseEvent e) {
			//마우스 패널 아웃
			Component c = (Component) e.getSource();
			c.setBackground(Color.YELLOW);
			//마우스 빠져나올 시 컬러 노란색으로 
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + ", " + e.getY()
			+ ")");
			//마우스 드래그 시 x,y좌표와 드래그 메시지 출력
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + ", " + e.getY()
			+ ")");
			//마우스 움직일 시 움직인다는 메세지와 x,y좌표 출력
		}
	}
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}