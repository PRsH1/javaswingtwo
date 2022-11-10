package javaproject6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuActionEventEx extends JFrame{
	
	private JLabel la = new JLabel();
	public MenuActionEventEx() {
		setTitle("MenuActionEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		
		c.setLayout(new BorderLayout());//레이아웃을 보더레이아웃으로
		createMenu();
		c.add(la, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		JMenuItem[] menuItem = new JMenuItem[4];//전 예제와 달리 메뉴아이템을 배열로 선언하였음
		String[] itemTitle = {"Load", "Hide", "Reshow", "Exit"};
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			//반복문
			if(i==menuItem.length-1)
				screenMenu.addSeparator();//출 나눔(분리선)
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			//menuItem[i].addActionListener(new MenuActionListener());익명 클래스를 이용해 구현할 수 있지만 비효율적임(각각의 객체가 형성되므로)
			screenMenu.add(menuItem[i]);
			//반복문을 돌면서 메뉴아이템 추가
		}
	
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		mb.add(screenMenu);
		this.setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Load":
				if(la.getIcon() != null)//아이콘이 null이 아니라면
					return;//한번만 리턴
				la.setIcon(new ImageIcon("images/pear.jpg"));
				break;//브레이크 해줘야 함
			case "Hide":
				la.setVisible(false);
				break;
			case "Reshow":
				la.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}
	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}