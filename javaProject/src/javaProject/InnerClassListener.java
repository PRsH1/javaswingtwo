package javaProject;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	//클래스 이너클래스 리스너

	public InnerClassListener() {
		setTitle("ActionEvent Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new FlowLayout());
		MyActionListener listner=new MyActionListener();
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(350,150);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener{
		//내부 클래스 ActionListener
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else {	
				b.setText("Action");
			}
			InnerClassListener.this.setTitle(b.getText());
				
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
		//메인 메소드에서 이너클래스리스너 객체 호출

	}
	

}

