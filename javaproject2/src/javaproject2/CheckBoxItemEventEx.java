package javaproject2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	
	private JCheckBox[] fruits = new JCheckBox[3];
	//üũ�ڽ� (����) �迭 3�� ��ü ����
	
	private final String[] names = {"���", "��", "ü��"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		
		setTitle("CheckBoxItemEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 2000��, �� 3000��, ü�� 5000��"));
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			
			fruits[i] = new JCheckBox(names[i]);
			//üũ�ڽ��� �̸��迭 ������� ����
			fruits[i].setBorderPainted(true);
			//��輱�� ������
			c.add(fruits[i]);
			//������Ʈ ������� �߰�
			fruits[i].addItemListener(listener);
			
		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		setSize(250, 150);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		
		
		private int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				//üũ�ڽ����� Ư�� �������� ����Ʈ �� ���
				
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
			sumLabel.setText("���� " + sum + "�� �Դϴ�.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}