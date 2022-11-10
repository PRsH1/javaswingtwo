package javaproject2;

import javax.swing.*;
import java.awt.*;
public class LabelEx extends JFrame {
	
	public LabelEx() {
		
		setTitle("LabelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
	
		JLabel textLabel = new JLabel("LOVE");
		ImageIcon imageicon = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(imageicon);
		ImageIcon imageicon2 = new ImageIcon("images/normalIcon.gif");
	
		JLabel label = new JLabel("Call me if you want",  imageicon2, SwingConstants.RIGHT);
		//imgageicon2 �����ʿ� �� �߰�
		label.setOpaque(true);//label ���� true
		label.setBackground(Color.pink);//������ pink������
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(480, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}
