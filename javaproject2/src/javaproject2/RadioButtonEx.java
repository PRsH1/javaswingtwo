package javaproject2;

import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		
		setTitle("라디오 버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();//버튼 그룹 객체 생성
		JRadioButton apple = new JRadioButton("apple");
		JRadioButton pear = new JRadioButton("pear");
		JRadioButton cherry = new JRadioButton("cherry",cherryIcon);
		//버튼 그룹 없을 시 라디오 버튼이 독립적으로 동작하지 않음
		
		cherry.setSelectedIcon(selectedCherryIcon);
		cherry.setBorderPainted(true);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(360, 480);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
