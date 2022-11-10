package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsDrawImageEx3 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx3() {
		setTitle("�̹��� �׸���3");
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
			/*���� �̹����� (100, 50)���� (200, 200)������ �簢�� �κ��� MyPanel ����
			(20, 20)���� (250, 100)�� �������� �����ϸ��Ͽ� �׸��� ���α׷��� �ۼ��Ͻÿ�.
			*/
			//���� ��ġ �����ϰ�(20 20) �����ϸ��� ������ �����ϰ�(250,100)
			//�̹����� Ư�� �κ���(100,50~200,200 ��ġ����)�����ϸ���
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}
}