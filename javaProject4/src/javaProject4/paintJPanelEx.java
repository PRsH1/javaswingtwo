package javaProject4;
import javax.swing.*;
import java.awt.*;
public class paintJPanelEx extends JFrame{
	//camelCase��Ű�� ������
	
	private MyPanel panel = new MyPanel();
	//Mypnel��ü ����
	public paintJPanelEx() {
		
		setTitle("PaintJPanelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//��ü panel�� seeContentPane
		setSize(250, 220);
		setVisible(true);
		
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//�θ� Ŭ���� ȣ��(�� ��� JPanel�� ������� ȣ���)
			g.setColor(Color.BLUE);
			g.drawRect(10,10, 50, 30);//(x,y,����,����)
			g.drawRect(50, 30, 50, 30);
			g.setColor(Color.MAGENTA);//������ �ٲ۴�
			g.drawRect(90, 50, 50, 30);
		}
	}
	public static void main(String[] args) {
		
		new paintJPanelEx();
	}
}