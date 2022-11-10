package javaproject2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RadioButtonItemEventEx extends JFrame {
	
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"사과", "배", "체리"};
	//러디오버튼에 쓰일 텍스트
	private ImageIcon[] image = {
			//image객체
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")};
	
	private JLabel la = new JLabel();
	
	public RadioButtonItemEventEx() {
		
		setTitle("RadioButtonItemEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);//라디오버튼 영역 백그라운드 컬러 회색
		
		MyItemListener listener = new MyItemListener();
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<radio.length; i++) {
			//반복문
			radio[i] = new JRadioButton(text[i]);
			radio[i].addItemListener(listener);//리스너 추가
			g.add(radio[i]);//라디오버튼 추가
			radioPanel.add(radio[i]);//JPanel 추가
		}
		radio[0].setSelected(true);//사과 버튼이 처음으로 선택됨
		
		c.add(radioPanel, BorderLayout.NORTH);//윗쪽으로 
		c.add(la, BorderLayout.CENTER);//라디오버튼들 중앙 정렬 add(label 객체)
		la.setHorizontalAlignment(SwingConstants.CENTER);//사진 콘텐츠를 중앙 정렬
		setSize(300, 250);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		
		@Override
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				la.setIcon(image[0]);
			else if(radio[1].isSelected())
				la.setIcon(image[1]);
			else if(radio[2].isSelected())
				la.setIcon(image[2]);
		}
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}
}