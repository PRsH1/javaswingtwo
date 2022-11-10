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
		//키 이벤트 리스너
		
		la = new JLabel[3];
		la[0] = new JLabel("getKeyCode()");
		la[1] = new JLabel("getKeyChar()");
		la[2] = new JLabel("getKeyText()");
		
		for(int i=0; i < la.length; i++) {
			c.add(la[i]);
			la[i].setOpaque(true);//setOpaque가 true여야만 배경색 활성화됨
			la[i].setBackground(Color.YELLOW);//백그라운드 색 노랑색
		}
		setSize(300, 150);
		setVisible(true);
		c.setFocusable(true);
		//setFocusable은 setVisible 호출 뒤에 호출해야함
		
		c.requestFocus();
		//키 입력을 받기 위해 컴포넌트에 포커스 주기 위해 컴포넌트 클래스의 
		//requestFocus()메소드 호출함
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			//입력된 키 판별 메소드
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			la[0].setText(Integer.toString(keyCode));
			la[1].setText(Character.toString(keyChar));
			la[2].setText(KeyEvent.getKeyText(keyCode));
			//각각 키 고유 코드 유니코드 이름 문자열임
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
