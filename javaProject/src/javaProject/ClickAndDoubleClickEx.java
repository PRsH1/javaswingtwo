package javaProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ClickAndDoubleClickEx extends JFrame {
	
	private JLabel la = new JLabel("Welcome");
	
	public ClickAndDoubleClickEx() {
		setTitle("ClickAndDoubleClickEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Component c = getContentPane();
		c.addMouseListener(new MyMouseLitsener());
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	class MyMouseLitsener extends MouseAdapter {
		
		public void mouseClicked(MouseEvent e) {
			la.setText(Integer.toString(e.getClickCount())+"-times clicked");
			if(e.getClickCount() == 2) {
				//두번 클릭하면 
				la.setText("Double clicked!");
				//더블 클릭 메세지 출력
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				//컬러 값 0~255 사이 랜덤하게 설정
				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
				//랜덤하게 설정된 백그라운드 출력
			}
			else if (e.getClickCount()==1) {
				la.setText("Single click!");
			}
			
		}
		public void mouseWheelMoved(MouseWheelEvent e) {
			
		}
	}
	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}