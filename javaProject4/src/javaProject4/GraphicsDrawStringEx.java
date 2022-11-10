package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsDrawStringEx extends JFrame{
	
	private MyPanel panel = new MyPanel();
	//�����̺� ��ü MyPanel �ϳ� ����
	public GraphicsDrawStringEx() {
		
		setTitle("GraphicsDrawStringEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		//����Ʈ�� �гη� ����
		setSize(250, 220);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		//MyPanel�� Jpanel�� ��ӹ���
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			//�� �ڵ尡 �־���� �׸��� �׷���
			g.drawString("Java is so funny!", 30, 30);
			g.drawString("What?!", 120, 60);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}
}