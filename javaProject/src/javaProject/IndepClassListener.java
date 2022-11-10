package javaProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame{

	public IndepClassListener() {
		setTitle("ActionEvent Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		//MyActionListener listener = new MyActionListener();
		//���� Ŭ������ �ۼ�:
		btn.addActionListener(new MyActionListener());
		
		
		c.add(btn);
		setSize(350,150);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();

	}
	

}

class MyActionListener implements ActionListener{
	//���� Ŭ���� ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else {	
			b.setText("Action");
		}
			
		
	}
}
