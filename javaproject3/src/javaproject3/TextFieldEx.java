package javaproject3;


import java.awt.*;
import javax.swing.*;
public class TextFieldEx extends JFrame
{
	public TextFieldEx() {
		setTitle("TextFieldEX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(20));//�ʵ� ���� 20
		c.add(new JLabel("�б�"));
		c.add(new JTextField("����ȸ���б�", 20));
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("���� ���α� ������ 320", 20));
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
