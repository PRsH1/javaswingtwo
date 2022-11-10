package javaproject2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	
	private JCheckBox[] fruits = new JCheckBox[3];
	//체크박스 (과일) 배열 3개 객체 생성
	
	private final String[] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		
		setTitle("CheckBoxItemEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 2000원, 배 3000원, 체리 5000원"));
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			
			fruits[i] = new JCheckBox(names[i]);
			//체크박스에 이름배열 순서대로 삽입
			fruits[i].setBorderPainted(true);
			//경계선을 구려줌
			c.add(fruits[i]);
			//컴포넌트 순서대로 추가
			fruits[i].addItemListener(listener);
			
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		setSize(250, 150);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		
		
		private int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				//체크박스에서 특정 아이템이 셀렉트 된 경우
				
				if(e.getItem() == fruits[0])
					sum += 2000;
				else if(e.getItem() == fruits[1])
					sum += 3000;
				else
					sum += 5000;
				
			}
			else {
				
				if(e.getItem() == fruits[0])
					sum -= 2000;
				else if(e.getItem() == fruits[1])
					sum -= 3000;
				else
					sum -= 5000;
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}