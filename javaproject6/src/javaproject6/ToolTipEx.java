package javaproject6;

import javax.swing.*;
import java.awt.*;
public class ToolTipEx extends JFrame {
	
	private Container contentPane;
	public ToolTipEx() {
		
		setTitle("ToolTipEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = this.getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
		
	}
	private void createToolBar() {
		
		JToolBar toolBar = new JToolBar("���� �޴�");
		toolBar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�.");
		toolBar.add(newBtn);
		JButton openBtn = new JButton(
				new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("������ ���ϴ�.");
		toolBar.add(openBtn);
		JButton saveBtn = new JButton(
				new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("������ �����մϴ�.");
		toolBar.add(saveBtn);
		toolBar.add(new JLabel("�˻�"));
		JTextField tf = new JTextField("�˻��� ������ �Է��ϼ���.");
		tf.setToolTipText("�Է��� ������ �˻��մϴ�.");
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C/C++");
		combo.addItem("Python");
		combo.setToolTipText("�� �������ּ���");
		toolBar.add(combo);
		toolBar.add(tf);
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolTipEx();
	}
}
