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
	//private �� jLabel Ŭ���� �ϳ� ����(��� �̹���)
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	//�޺��ڽ� ������ �ϳ� ����, ���ϵ��� �޾ƿ�
	public ComboActionEx() {
		setTitle("ComboActionEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();//����Ʈ �� ����
		c.setLayout(new FlowLayout());//���̾ƿ� ����
		c.add(strCombo);//����Ʈ�ҿ� �޺��ڽ� �߰�
		c.add(la);//����Ʈ�ҿ� �� �߰�
		strCombo.addActionListener(new ActionListener() {
			//�޺��ڽ��� �׼Ǹ����� �͸�Ŭ���� ����
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox) e.getSource();
				//���� ��� �ҽ� �޾ƿ�(�޺��ڽ� �ϳ� �����ؼ�)
				int index = cb.getSelectedIndex();
				//����ڰ� �޺��ڽ� ������ �����ϸ� ������ ���� �������� index�� ����
				la.setIcon(images[index]);
				//JLabel index �� �������� �̹��� ���
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}
}