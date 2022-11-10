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
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+ "키가 입력됨");
			//키가 입력되면 (누른 키)+:키가 입력됨"이라는 메세지 출력
			Container c = (Container)e.getSource();
			if(e.getKeyChar() == '%')
				c.setBackground(Color.YELLOW);
			//%입력하면 노란색 백그라운드
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				c.setBackground(Color.GREEN);
			//f1키 입력하면 초록색 백그라운드
			else {
				la.setText(KeyEvent.getKeyText(e.getKeyCode())+ "키가 입력되어 주황색 출력");
				c.setBackground(Color.orange);
			}
		}
	};
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}