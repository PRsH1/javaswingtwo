package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsColorFontEx extends JFrame{
	private MyPanel panel = new MyPanel();
	//Mypanel객체 하나 생성
	public GraphicsColorFontEx() {
		setTitle("GraphicsColorFontEx");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		//MyPanel을 컨텐트팬으로
		
		setSize(600, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.BLUE);//color blue로 설정
			g.drawString("BLUE-default", 30, 30);
			//30 30위치에 객체를 그림
			
			g.setColor(new Color(255, 0, 0));//빨간색
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			//fontface,style,크기 (폰트 세트)
			g.drawString("RED-Arial-30", 30, 60);
			//30 60위치에 객체를 그림
			
			g.setColor(new Color(0x00ff00ff));
			//핑크색(마젠타)로 설정
			for(int i=1; i<=5; i++) {
				g.setFont(new Font("Consolas",Font.BOLD |Font.ITALIC, i*10));
				//크기를 키워가면서 
				g.drawString("MAGENTA-Consolas-" +Integer.toString(i*10), 30, 60 + i*50);
				//MAGENTA-Consolas 10 20 30 40...이라는 글자가 x=30위치 y=60+i*50위치로 설정
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}