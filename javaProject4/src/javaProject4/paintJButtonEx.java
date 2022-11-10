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
		//Mybutton객체 생성, 이 객체는 JButton 상속받음
		
		b.setOpaque(true);//배경색 설정할떄 이 값이 True여야 함
		b.setBackground(Color.CYAN);
		
		c.add(b);
		setSize(250, 220);
		setVisible(true);
	}
	class MyButton extends JButton {
		
		public MyButton(String s) {
			super(s);
			//JButton 생성자 호출해야만 MyButton 글자 출력
		}
		public void paintComponent(Graphics g) {
			//눌렀을 떄 변화
			super.paintComponent(g);
			//마찬가지로 부모 클래스 메소드 호출해야만 JButton이 그려짐(글자,베경색 등)
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
			//(x,y,가로너비,세로높이)
		}
	}
	public static void main(String[] args) {
		new paintJButtonEx();
	}
}