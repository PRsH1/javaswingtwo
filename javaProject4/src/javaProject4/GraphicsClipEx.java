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
		//�̹��� ��ü icon ����(private ��ü)
		private Image image = icon.getImage();
		//image ��ü ����->�̹���(icon)�� ������
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			//�г��� 100 20 ��ġ�� 150x150ũ���� Ŭ���� ���� ����
			g.drawImage(image, 0, 0, this.getWidth(),
					this.getHeight(), this);
			//�̹����� �ʺ� ���̸� �޾ƿͼ� �̹����� 0,0 ��ġ���� �����
			//������ �ʺ� ���̸� �޾ƿ����Ƿ� �߷����� ���� ����
			//(Ŭ���� ������ 150 150�̹Ƿ�
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Let's go!", 10, 150);
			//10 150 ��ġ�� Let's go! ���ڿ� ���
			//Let's �κ��� �߸�(150 150 ��ġ�� Ŭ������ �߱� ������)
		}
	}
	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}