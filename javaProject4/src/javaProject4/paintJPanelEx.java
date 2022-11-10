package javaProject4;
import javax.swing.*;
import java.awt.*;
public class paintJPanelEx extends JFrame{
	//camelCase지키면 오류남
	
	private MyPanel panel = new MyPanel();
	//Mypnel객체 생성
	public paintJPanelEx() {
		
		setTitle("PaintJPanelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//객체 panel을 seeContentPane
		setSize(250, 220);
		setVisible(true);
		
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//부모 클래스 호출(이 경우 JPanel의 내용들이 호출됨)
			g.setColor(Color.BLUE);
			g.drawRect(10,10, 50, 30);//(x,y,가로,세로)
			g.drawRect(50, 30, 50, 30);
			g.setColor(Color.MAGENTA);//색상을 바꾼다
			g.drawRect(90, 50, 50, 30);
		}
	}
	public static void main(String[] args) {
		
		new paintJPanelEx();
	}
}