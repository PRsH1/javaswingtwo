package javaProject4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class GraphicsDrawLineMouseEx extends JFrame{
	
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineMouseEx() {
		setTitle("GraphicsDrawLineMouseEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		//백터 객체 vStart와 vEnd 생성
		private JLabel la =new JLabel();
		public MyPanel() {
			
		
			this.addMouseListener(new MouseAdapter() {
				//마우스리스너 클래스(익명 클래스)
				public void mousePressed(MouseEvent e) {
					//마우스를 누르면
					vStart.add(e.getPoint());
					
				}
				public void mouseReleased(MouseEvent e) {
					//마우스를 때면
					vEnd.add(e.getPoint());
					repaint();
					//컴포넌트 강제로 다시 그리도록 지시
					//원래는  paintComponent(g) 를 호출해야하지만
					//직접 호출 불가하기 때문에 이 메소드 호출
				}
				public void mouseMoved(MouseEvent e) {
					la.setText(Integer.toString((int) e.getX()));
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				g.drawLine((int) s.getX(), (int) s.getY(),
						(int) e.getX(), (int) e.getY());
				//타입캐스팅 해 줘야함->int
				
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
}