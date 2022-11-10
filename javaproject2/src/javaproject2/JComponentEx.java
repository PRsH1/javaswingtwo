package javaproject2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		
		setTitle("JComponentEx");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);//배경색 
		b1.setForeground(Color.MAGENTA);//글자색
		b1.setFont(new Font("Arial", Font.ROMAN_BASELINE |Font.ITALIC, 20));
		//폰트 세팅
		b2.setEnabled(false);//버튼 디세이블됨
		b3.addActionListener(new ActionListener() {
			//액션 리스너 익명 클래스
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
				//컴포넌트의 x,y좌표를 타이틀에 출력
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(320, 240);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}
}
