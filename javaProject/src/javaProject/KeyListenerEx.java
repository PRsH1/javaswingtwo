package javaProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx extends JFrame {
	private JLabel[] la;
	
	public KeyListenerEx() {
		setTitle("KeyListenerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		//Ű �̺�Ʈ ������
		
		la = new JLabel[3];
		la[0] = new JLabel("getKeyCode()");
		la[1] = new JLabel("getKeyChar()");
		la[2] = new JLabel("getKeyText()");
		
		for(int i=0; i < la.length; i++) {
			c.add(la[i]);
			la[i].setOpaque(true);//setOpaque�� true���߸� ���� Ȱ��ȭ��
			la[i].setBackground(Color.YELLOW);//��׶��� �� �����
		}
		setSize(300, 150);
		setVisible(true);
		c.setFocusable(true);
		//setFocusable�� setVisible ȣ�� �ڿ� ȣ���ؾ���
		
		c.requestFocus();
		//Ű �Է��� �ޱ� ���� ������Ʈ�� ��Ŀ�� �ֱ� ���� ������Ʈ Ŭ������ 
		//requestFocus()�޼ҵ� ȣ����
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			//�Էµ� Ű �Ǻ� �޼ҵ�
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			la[0].setText(Integer.toString(keyCode));
			la[1].setText(Character.toString(keyChar));
			la[2].setText(KeyEvent.getKeyText(keyCode));
			//���� Ű ���� �ڵ� �����ڵ� �̸� ���ڿ���
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
