package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsDrawImageEx2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx2() {
		setTitle("그래픽 드로우 이미지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image image = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(),this.getHeight(), this);
			//0,0위치에 패널에 꽉 차도록 만듦(getWidth와 getHeight로 이 이미지 크기너비 불러옴)
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}
}