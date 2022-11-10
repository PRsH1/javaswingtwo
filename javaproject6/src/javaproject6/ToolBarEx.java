package javaproject6;
import javax.swing.*;
import java.awt.*;
public class ToolBarEx extends JFrame {
	
	private Container contentPane;//contentPane �ɹ�����
	public ToolBarEx() {
		setTitle("ToolBarEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = this.getContentPane();//TollBar�߰� ���� ����Ʈ��
		
		
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	private void createToolBar() {
		
		JToolBar toolBar = new JToolBar("���� �޴�");
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("�˻�"));
		toolBar.add(new JTextField("�˻��� ������ �Է��ϼ���."));
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C/C++");
		combo.addItem("Python");
		toolBar.add(combo);
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolBarEx();
	}
}