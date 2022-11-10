package javaProject4;
import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame{
	
	private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		setTitle("GraphicsClipEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		//이미지 객체 icon 생성(private 객체)
		private Image image = icon.getImage();
		//image 객체 생성->이미지(icon)을 가져옴
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			//패널의 100 20 위치에 150x150크기의 클리핑 영역 설정
			g.drawImage(image, 0, 0, this.getWidth(),
					this.getHeight(), this);
			//이미지의 너비 높이를 받아와서 이미지의 0,0 위치부터 드로잉
			//원본의 너비 높이를 받아왔으므로 잘려져서 보일 거임
			//(클리핑 영역은 150 150이므로
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Let's go!", 10, 150);
			//10 150 위치에 Let's go! 문자열 출력
			//Let's 부분이 잘림(150 150 위치에 클리핑을 했기 떄문에)
		}
	}
	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}