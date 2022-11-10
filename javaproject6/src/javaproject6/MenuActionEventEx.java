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
		
		c.setLayout(new BorderLayout());//���̾ƿ��� �������̾ƿ�����
		createMenu();
		c.add(la, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		JMenuItem[] menuItem = new JMenuItem[4];//�� ������ �޸� �޴��������� �迭�� �����Ͽ���
		String[] itemTitle = {"Load", "Hide", "Reshow", "Exit"};
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			//�ݺ���
			if(i==menuItem.length-1)
				screenMenu.addSeparator();//�� ����(�и���)
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			//menuItem[i].addActionListener(new MenuActionListener());�͸� Ŭ������ �̿��� ������ �� ������ ��ȿ������(������ ��ü�� �����ǹǷ�)
			screenMenu.add(menuItem[i]);
			//�ݺ����� ���鼭 �޴������� �߰�
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
				if(la.getIcon() != null)//�������� null�� �ƴ϶��
					return;//�ѹ��� ����
				la.setIcon(new ImageIcon("images/pear.jpg"));
				break;//�극��ũ ����� ��
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