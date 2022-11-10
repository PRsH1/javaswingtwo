package javaProject4;

import javax.swing.*;
import java.awt.*;
public class paintJButtonEx extends JFrame{
	
	public paintJButtonEx() {
		
		setTitle("paintJButtonEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		MyButton b = new MyButton("MyButton");
		//Mybutton��ü ����, �� ��ü�� JButton ��ӹ���
		
		b.setOpaque(true);//���� �����ҋ� �� ���� True���� ��
		b.setBackground(Color.CYAN);
		
		c.add(b);
		setSize(250, 220);
		setVisible(true);
	}
	class MyButton extends JButton {
		
		public MyButton(String s) {
			super(s);
			//JButton ������ ȣ���ؾ߸� MyButton ���� ���
		}
		public void paintComponent(Graphics g) {
			//������ �� ��ȭ
			super.paintComponent(g);
			//���������� �θ� Ŭ���� �޼ҵ� ȣ���ؾ߸� JButton�� �׷���(����,����� ��)
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
			//(x,y,���γʺ�,���γ���)
		}
	}
	public static void main(String[] args) {
		new paintJButtonEx();
	}
}