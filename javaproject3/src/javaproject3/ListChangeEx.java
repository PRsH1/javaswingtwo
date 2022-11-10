package javaproject3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ListChangeEx extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private Vector<String> v = new Vector<String>();
	//������ ���� Ŭ���� v ����
	private JList<String> nameList = new JList<String>(v);
	//������ JList �̸� ����Ʈ �ϳ� ����
	//vector�� String�̹Ƿ� JList�� ��Ʈ�� ����
	
	public ListChangeEx() {
		
		setTitle("ListChangeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸��� �Է��� �� ����Ű�� �Է��ϼ���"));
		c.add(tf);
		//����Ʈ�ҿ� �ý�Ʈ �ʵ� ����
	    nameList.setListData(v);
	    //�׹ָ���Ʈ�� v�� ����� ����Ʈ ����
		v.add("�̽���");
		v.add("ȫ�浿");
		//�̽���,ȫ�浿�� �̸� ����Ʈ�� �̹� �����
		nameList.setFixedCellWidth(100);
		//���Ӹ���Ʈ�� �ʺ� 100���� ����
		nameList.setVisibleRowCount(5);
		//�̸��� ���̴� ������ 5���� ����
		c.add(new JScrollPane(nameList));
		//��ũ�������� ����
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField t = (JTextField) e.getSource();//�ؽ�Ʈ �ʵ�κ��� �ҽ� �޾ƿ´�
				v.add(t.getText());//vector�� ���� ����
				t.setText("");//�� �ڵ尡 ������ �ؽ�Ʈ �ʵ��� ���� ������� ����(setText=>���� �̶�� ��)
				nameList.setListData(v);//���Ӹ���Ʈ�� v�� ����� �� ����
				
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListChangeEx();
	}
}