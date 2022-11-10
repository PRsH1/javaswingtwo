package javaproject2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RadioButtonItemEventEx extends JFrame {
	
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"���", "��", "ü��"};
	//�������ư�� ���� �ؽ�Ʈ
	private ImageIcon[] image = {
			//image��ü
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
		radioPanel.setBackground(Color.gray);//������ư ���� ��׶��� �÷� ȸ��
		
		MyItemListener listener = new MyItemListener();
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<radio.length; i++) {
			//�ݺ���
			radio[i] = new JRadioButton(text[i]);
			radio[i].addItemListener(listener);//������ �߰�
			g.add(radio[i]);//������ư �߰�
			radioPanel.add(radio[i]);//JPanel �߰�
		}
		radio[0].setSelected(true);//��� ��ư�� ó������ ���õ�
		
		c.add(radioPanel, BorderLayout.NORTH);//�������� 
		c.add(la, BorderLayout.CENTER);//������ư�� �߾� ���� add(label ��ü)
		la.setHorizontalAlignment(SwingConstants.CENTER);//���� �������� �߾� ����
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