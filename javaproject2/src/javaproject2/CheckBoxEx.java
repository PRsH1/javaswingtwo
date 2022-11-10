package javaproject2;

import java.awt.*;
import javax.swing.*;
public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("CheckBoxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon Icon = new ImageIcon("images/cherry.jpg");//체리 아이콘
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");//클릭(체크) 체리 아이콘
		JCheckBox apple = new JCheckBox("apple");
		JCheckBox pear = new JCheckBox("pear");
		JCheckBox cherry = new JCheckBox("cherry", Icon);
		//JCheckBox cherry = new JCheckBox("cherry", Icon,true);->체크 아이콘으로 변경됨
		
		cherry.setSelectedIcon(selectedCherryIcon);
		cherry.setBorderPainted(true);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(340, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
