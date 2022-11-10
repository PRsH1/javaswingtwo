package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsFillEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("GraphicsFillEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 320);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillRect(20, 20, 40, 40);
			//사각형(Rect) x,y,w,h
			
			g.setColor(Color.BLUE);
			g.fillOval(20, 70, 40, 40);
			//원(Oval) x,y,w,h
			
			g.setColor(Color.GREEN);
			g.fillRoundRect(20, 120, 40, 40, 10, 10);
			//모서리가 둥근 사각형(x,y,w,h,arcwidth,archeight)
			//arcwidth=모서리의 수직적 지름
			
			g.setColor(Color.MAGENTA);
			g.fillArc(20, 170, 40, 40, 0, 270);
			//c(int x, int y, int w, int h, int startAngle, int arcAngle)
			//호,부채꼴 그리기
			//0부터 270도까지 그린다
			//startAngle=0은 완전한 원 기준으로 가로선 딱 붙어있음 270은 완전한 원 기준으로 세로선 딱 붙어있음
			g.setColor(Color.YELLOW);
			int[] x = {25, 20, 25, 60};
			int[] y = {220, 240, 260, 240};
			g.fillPolygon(x, y, 4);
			//• void fillPolygon(int[] x, int[] y, int n)

		}
	}
	public static void main(String[] args) {
		new GraphicsFillEx();
	}
}