package javaproject3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextAreaEx extends JFrame {
	
	private JTextField tf = new JTextField(20);//텍스트필드의 크기도 20
	private JTextArea ta = new JTextArea(7, 20);
	//row=7 cols=20 (세로 7 가로 20)
	
	public TextAreaEx() {
		
		setTitle("TextAreaEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름을 입력한 후 엔터키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			//액션 리스너 메소드 익명클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField t = (JTextField) e.getSource();
				//텍스트 필드에서 값 가져온댜ㅏ
				ta.append(t.getText() + "\n");
				//가져온 값들은 textarea에 append해줌
				t.setText("");
				//이 코드가 없으면 엔터키 누를 시 텍스트 필드의 값이 안사라짐
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
}