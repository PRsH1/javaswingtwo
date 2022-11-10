package javaproject3;

import java.awt.*;
import javax.swing.*;
public class ComboBoxEx extends JFrame {
	public ComboBoxEx() {
		setTitle("ComboBoxEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String[] fruits= {"apple", "banana", "kiwi", "mango","pear", "peach", "cherry", "strawberry","blackberry" };
		//과일 배열 1
		String[] fruits2 = {"사과", "바나나", "키위", "망고", "배","복숭아", "체리", "딸기", "블랙베리"};
		//과일 배열 2
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		//콤보박스 배열 생성(과일 배열을 받아옴)
		c.add(strCombo);
		//컨텐트팬에 추가
		JComboBox<String> strCombo2 = new JComboBox<String>();
		//콤보박스 배열 2 생성
		
		for(int i = 0; i < fruits2.length; i++) {

			strCombo2.addItem(fruits2[i]);
			//반복문으로 J콤보박스 strCombo2 String 객체에 아이템들 추가
		}
		c.add(strCombo2);
		//컨텐트팬에 추가
		strCombo2.removeItem(fruits2[1]);
		//1번 아이템을 삭제했음 (바나나)
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ComboBoxEx();
	}
}