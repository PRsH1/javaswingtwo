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
		//���� �迭 1
		String[] fruits2 = {"���", "�ٳ���", "Ű��", "����", "��","������", "ü��", "����", "������"};
		//���� �迭 2
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		//�޺��ڽ� �迭 ����(���� �迭�� �޾ƿ�)
		c.add(strCombo);
		//����Ʈ�ҿ� �߰�
		JComboBox<String> strCombo2 = new JComboBox<String>();
		//�޺��ڽ� �迭 2 ����
		
		for(int i = 0; i < fruits2.length; i++) {

			strCombo2.addItem(fruits2[i]);
			//�ݺ������� J�޺��ڽ� strCombo2 String ��ü�� �����۵� �߰�
		}
		c.add(strCombo2);
		//����Ʈ�ҿ� �߰�
		strCombo2.removeItem(fruits2[1]);
		//1�� �������� �������� (�ٳ���)
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ComboBoxEx();
	}
}