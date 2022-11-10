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
		//imgageicon2 오른쪽에 라벨 추가
		label.setOpaque(true);//label 배경색 true
		label.setBackground(Color.pink);//배경색을 pink색으로
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
