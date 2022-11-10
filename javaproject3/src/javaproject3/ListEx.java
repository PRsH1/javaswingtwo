package javaproject3;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
public class ListEx extends JFrame {
	public ListEx() {
		setTitle("ListEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String [] fruits= {"apple", "banana", "kiwi", "mango","pear","peach","berry","strawberry","blackberry"};
		//과일 String(문자형) 배열 선언하고 채워줌
		JList<String> strList = new JList<String>(fruits);
		//문자형 Jlist 클래스 하나 생성
		c.add(strList);
		JList<String> strList2 = new JList<String>(fruits);
		//JList 클래스 하나 생성
		c.add(new JScrollPane(strList2));
		//컨텐트팬에 추가(스크롤형 리스트)
		ImageIcon [] images = {new ImageIcon("images/icon1.png"),
				new ImageIcon("images/icon2.png"),
				new ImageIcon("images/icon3.png"),
				new ImageIcon("images/icon4.png")
				//이미지아이콘 형 이미지 배열 추가
		};
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		//이미지형 JList추가
		imageList.setListData(images);
		//배열에 저장된 이미지들 imgalist에 추가함
		c.add(imageList);
		//컨텐트팬에 추가
		// 빈 리스트 컴포넌트 생성 후 setListData() 메소드로 아이템 추가하기
		/*
		Vector v = new Vector();
		v.add("apple");
		v.add("banana");
		v.add("kiwi"); 
		JList<String> vList = new JList<String>(v);
		
		백터로도 추가 가능
		*/
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
}