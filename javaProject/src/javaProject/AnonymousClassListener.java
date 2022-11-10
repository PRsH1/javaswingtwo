package javaProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame{
	

	public AnonymousClassListener() {
		setTitle("ActionEvent Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		
		c.add(btn);
		btn.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�͸� Ŭ����
				JButton b =(JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else {	
					b.setText("Action");
				}
				setTitle(b.getText());
				
			}
		
		});
		setSize(350,150);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousClassListener();

	}
	

}


