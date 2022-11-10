package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsDrawStringEx extends JFrame{
	
	private MyPanel panel = new MyPanel();
	//프라이빗 객체 MyPanel 하나 생성
	public GraphicsDrawStringEx() {
		
		setTitle("GraphicsDrawStringEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		//컨텐트팬 패널로 설정
		setSize(250, 220);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		//MyPanel은 Jpanel을 상속받음
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			//이 코드가 있어야지 그림이 그려짐
			g.drawString("Java is so funny!", 30, 30);
			g.drawString("What?!", 120, 60);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}
}