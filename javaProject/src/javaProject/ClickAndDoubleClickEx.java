package javaProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ClickAndDoubleClickEx extends JFrame {
	
	private JLabel la = new JLabel("Welcome");
	
	public ClickAndDoubleClickEx() {
		setTitle("ClickAndDoubleClickEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Component c = getContentPane();
		c.addMouseListener(new MyMouseLitsener());
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	class MyMouseLitsener extends MouseAdapter {
		
		public void mouseClicked(MouseEvent e) {
			la.setText(Integer.toString(e.getClickCount())+"-times clicked");
			if(e.getClickCount() == 2) {
				//�ι� Ŭ���ϸ� 
				la.setText("Double clicked!");
				//���� Ŭ�� �޼��� ���
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				//�÷� �� 0~255 ���� �����ϰ� ����
				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
				//�����ϰ� ������ ��׶��� ���
			}
			else if (e.getClickCount()==1) {
				la.setText("Single click!");
			}
			
		}
		public void mouseWheelMoved(MouseWheelEvent e) {
			
		}
	}
	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}