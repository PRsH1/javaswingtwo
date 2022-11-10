package javaproject7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OptionPaneEx extends JFrame{
	public OptionPaneEx() {
		setTitle("OptionPaneEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new MyPanel(), BorderLayout.NORTH);
		setSize(500, 200);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private JButton inputBtn = new JButton("Input Name");
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		private JTextField tf = new JTextField(10);
		public MyPanel() {
			this.setBackground(Color.LIGHT_GRAY);
			this.add(inputBtn);
			this.add(confirmBtn);
			this.add(messageBtn);
			this.add(tf);
			inputBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
					if(name != null)
						tf.setText(name);
				}
			});
			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton) e.getSource();
					int result = JOptionPane.showConfirmDialog(
							btn.getTopLevelAncestor(), "��� �Ͻðڽ��ϱ�?", "Ȯ��",JOptionPane.YES_NO_OPTION);
					switch(result) {
						case JOptionPane.YES_OPTION:
						tf.setText("Yes");
						break;
						case JOptionPane.NO_OPTION:
							tf.setText("NO");
							break;
						case JOptionPane.CLOSED_OPTION:
							tf.setText("w/o SELECTION");
							break;
					}
				}
			});
			messageBtn.addActionListener
			(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog
					(null, "�����ϼ���", "���� �޽���",JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}
	public static void main(String[] args) {
		new OptionPaneEx();
	}
}
