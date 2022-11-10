package javaproject3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboActionEx extends JFrame {
	private String[] fruits= {"apple", "banana", "kiwi", "mango"};
	private ImageIcon[] images = {
			
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	private JLabel la = new JLabel(images[0]);
	//private 형 jLabel 클래스 하나 생성(사과 이미지)
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	//콤보박스 문자형 하나 생성, 과일들을 받아옴
	public ComboActionEx() {
		setTitle("ComboActionEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();//컨텐트 팬 생성
		c.setLayout(new FlowLayout());//레이아웃 정렬
		c.add(strCombo);//컨텐트팬에 콤보박스 추가
		c.add(la);//컨텐트팬에 라벨 추가
		strCombo.addActionListener(new ActionListener() {
			//콤보박스에 액션리스너 익명클래스 생성
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox) e.getSource();
				//과일 목록 소스 받아옴(콤보박스 하나 생성해서)
				int index = cb.getSelectedIndex();
				//사용자가 콤보박스 아이템 선택하면 선택한 값의 순서값을 index에 저장
				la.setIcon(images[index]);
				//JLabel index 값 기준으로 이미지 출력
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}
}