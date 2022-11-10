package javaProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("KeyCodeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+ "Ű�� �Էµ�");
			//Ű�� �ԷµǸ� (���� Ű)+:Ű�� �Էµ�"�̶�� �޼��� ���
			Container c = (Container)e.getSource();
			if(e.getKeyChar() == '%')
				c.setBackground(Color.YELLOW);
			//%�Է��ϸ� ����� ��׶���
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				c.setBackground(Color.GREEN);
			//f1Ű �Է��ϸ� �ʷϻ� ��׶���
			else {
				la.setText(KeyEvent.getKeyText(e.getKeyCode())+ "Ű�� �ԷµǾ� ��Ȳ�� ���");
				c.setBackground(Color.orange);
			}
		}
	};
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}