package javaproject3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextAreaEx extends JFrame {
	
	private JTextField tf = new JTextField(20);//�ؽ�Ʈ�ʵ��� ũ�⵵ 20
	private JTextArea ta = new JTextArea(7, 20);
	//row=7 cols=20 (���� 7 ���� 20)
	
	public TextAreaEx() {
		
		setTitle("TextAreaEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸��� �Է��� �� ����Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			//�׼� ������ �޼ҵ� �͸�Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField t = (JTextField) e.getSource();
				//�ؽ�Ʈ �ʵ忡�� �� �����´���
				ta.append(t.getText() + "\n");
				//������ ������ textarea�� append����
				t.setText("");
				//�� �ڵ尡 ������ ����Ű ���� �� �ؽ�Ʈ �ʵ��� ���� �Ȼ����
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
}