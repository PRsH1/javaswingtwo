package javaproject2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		
		setTitle("JComponentEx");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);//���� 
		b1.setForeground(Color.MAGENTA);//���ڻ�
		b1.setFont(new Font("Arial", Font.ROMAN_BASELINE |Font.ITALIC, 20));
		//��Ʈ ����
		b2.setEnabled(false);//��ư ���̺��
		b3.addActionListener(new ActionListener() {
			//�׼� ������ �͸� Ŭ����
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
				//������Ʈ�� x,y��ǥ�� Ÿ��Ʋ�� ���
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(320, 240);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}
}
