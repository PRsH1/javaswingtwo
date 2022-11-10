package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsDrawImageEx3 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx3() {
		setTitle("이미지 그리기3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image image = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, 250, 100,
					100, 50, 200, 200, this);
			/*원본 이미지의 (100, 50)에서 (200, 200)가지의 사각형 부분을 MyPanel 상의
			(20, 20)에서 (250, 100)의 영역으로 스케일링하여 그리는 프로그램을 작성하시오.
			*/
			//먼저 위치 지정하고(20 20) 스케일링할 사이즈 지정하고(250,100)
			//이미지의 특정 부분을(100,50~200,200 위치까지)스케일링함
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}
}