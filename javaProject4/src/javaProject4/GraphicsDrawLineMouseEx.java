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
		//���� ��ü vStart�� vEnd ����
		private JLabel la =new JLabel();
		public MyPanel() {
			
		
			this.addMouseListener(new MouseAdapter() {
				//���콺������ Ŭ����(�͸� Ŭ����)
				public void mousePressed(MouseEvent e) {
					//���콺�� ������
					vStart.add(e.getPoint());
					
				}
				public void mouseReleased(MouseEvent e) {
					//���콺�� ����
					vEnd.add(e.getPoint());
					repaint();
					//������Ʈ ������ �ٽ� �׸����� ����
					//������  paintComponent(g) �� ȣ���ؾ�������
					//���� ȣ�� �Ұ��ϱ� ������ �� �޼ҵ� ȣ��
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
				//Ÿ��ĳ���� �� �����->int
				
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
}