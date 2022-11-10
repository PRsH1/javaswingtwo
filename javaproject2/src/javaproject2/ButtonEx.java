package javaproject2;

import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		
		setTitle("ButtonEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		//images폴더 안에 있는 gif파일들
		
		JButton btn = new JButton("call", normalIcon);
		//통화 버튼, normal아이콘
		
		btn.setRolloverIcon(rolloverIcon);//마우스 hover했을떄 rolloverIcon 객체 호출
		btn.setPressedIcon(pressedIcon);//마우스 clicked했을떄 pressedIcon 객체 호출
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}
}
