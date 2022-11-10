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
		//���� String(������) �迭 �����ϰ� ä����
		JList<String> strList = new JList<String>(fruits);
		//������ Jlist Ŭ���� �ϳ� ����
		c.add(strList);
		JList<String> strList2 = new JList<String>(fruits);
		//JList Ŭ���� �ϳ� ����
		c.add(new JScrollPane(strList2));
		//����Ʈ�ҿ� �߰�(��ũ���� ����Ʈ)
		ImageIcon [] images = {new ImageIcon("images/icon1.png"),
				new ImageIcon("images/icon2.png"),
				new ImageIcon("images/icon3.png"),
				new ImageIcon("images/icon4.png")
				//�̹��������� �� �̹��� �迭 �߰�
		};
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		//�̹����� JList�߰�
		imageList.setListData(images);
		//�迭�� ����� �̹����� imgalist�� �߰���
		c.add(imageList);
		//����Ʈ�ҿ� �߰�
		// �� ����Ʈ ������Ʈ ���� �� setListData() �޼ҵ�� ������ �߰��ϱ�
		/*
		Vector v = new Vector();
		v.add("apple");
		v.add("banana");
		v.add("kiwi"); 
		JList<String> vList = new JList<String>(v);
		
		���ͷε� �߰� ����
		*/
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}
}