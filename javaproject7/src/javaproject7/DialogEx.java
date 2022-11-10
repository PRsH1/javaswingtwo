package javaproject7;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyDialog extends JDialog {
	
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		setSize(200, 100);
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		this.add(tf);
		this.add(okBtn);
	}
}
public class DialogEx extends JFrame{
	//DialogEx의 소유자는 JFrame
	private MyDialog dialog;
	public DialogEx() {
		
		super("DialogEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		dialog = new MyDialog(this, "Test Dialog");
		JButton btn = new JButton("Show Dialog");
		btn.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		c.add(btn);
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx();
	}
}
