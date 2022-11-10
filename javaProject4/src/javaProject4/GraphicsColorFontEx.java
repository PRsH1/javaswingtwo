package javaProject4;

import javax.swing.*;
import java.awt.*;
public class GraphicsColorFontEx extends JFrame{
	private MyPanel panel = new MyPanel();
	//Mypanel��ü �ϳ� ����
	public GraphicsColorFontEx() {
		setTitle("GraphicsColorFontEx");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		//MyPanel�� ����Ʈ������
		
		setSize(600, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.BLUE);//color blue�� ����
			g.drawString("BLUE-default", 30, 30);
			//30 30��ġ�� ��ü�� �׸�
			
			g.setColor(new Color(255, 0, 0));//������
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			//fontface,style,ũ�� (��Ʈ ��Ʈ)
			g.drawString("RED-Arial-30", 30, 60);
			//30 60��ġ�� ��ü�� �׸�
			
			g.setColor(new Color(0x00ff00ff));
			//��ũ��(����Ÿ)�� ����
			for(int i=1; i<=5; i++) {
				g.setFont(new Font("Consolas",Font.BOLD |Font.ITALIC, i*10));
				//ũ�⸦ Ű�����鼭 
				g.drawString("MAGENTA-Consolas-" +Integer.toString(i*10), 30, 60 + i*50);
				//MAGENTA-Consolas 10 20 30 40...�̶�� ���ڰ� x=30��ġ y=60+i*50��ġ�� ����
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}