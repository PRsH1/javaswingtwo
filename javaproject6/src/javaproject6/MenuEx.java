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
		JMenuBar mb = new JMenuBar();//�޴��� �����
		JMenu screenMenu = new JMenu("Screen");//�޴� ����� �޴��ٿ� ���δ�	
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();//�� ����(�и���)
		screenMenu.add(new JMenuItem("Exit"));
		//��ũ�� �ؿ� ���� �޴�����(��ũ�� Ŭ�� �� ������ ���� �޴���)
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