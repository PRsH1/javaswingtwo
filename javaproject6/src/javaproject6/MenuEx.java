package javaproject6;

import javax.swing.*;
import java.awt.*;
public class MenuEx extends JFrame{
	public MenuEx() {
		setTitle("MenuEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();//메뉴바 만들기
		JMenu screenMenu = new JMenu("Screen");//메뉴 만들고 메뉴바에 붙인다	
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();//출 나눔(분리선)
		screenMenu.add(new JMenuItem("Exit"));
		//스크린 밑에 붙은 메뉴들임(스크린 클릭 시 나오는 하위 메뉴들)
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		this.setJMenuBar(mb);
	}
	public static void main(String[] args) {
		new MenuEx();
	}
}