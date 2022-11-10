package javaproject3;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	
	private JLabel la = new JLabel(" COLORED LABEL ");
	private JSlider[] sl = new JSlider[3];
	//�����̴� 3�� ������
	
	MyListener listener=new MyListener();
	public SliderChangeEx() {
		//�����̴� ü���� �޼ҵ�
		
		setTitle("SliderChangeEx");
		//Ÿ��Ʋ�� �����̴� ü����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//����Ʈ �� ����
		c.setLayout(new FlowLayout());
		
		for(int i=0; i<sl.length; i++) {
			
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			//RGB �ּ� 0 �ִ� 255 �߰� 128 ��ȣ��(�����̴� ���)
			sl[i].setPaintTrack(true);
			//setPaintTrack(boolean b)	b�� true�̸� �����̴��� Ʈ���� ���̰� �ϰ� 
			//b�� false�̸� �����.
			sl[i].setPaintTicks(true);
			//������
			sl[i].setMajorTickSpacing(50);//ū ������ ���� ����
			sl[i].setMinorTickSpacing(10);//���� ������ ���� ����
			sl[i].setPaintLabels(true);//ū ������ �������� ���� ����
			sl[i].addChangeListener(new MyListener());
			//sl[i].addChangeListener(listener);�� �ص� ��
		    //���� ��ü ���� ��
			
			c.add(sl[i]);
			//����Ʈ�ҿ� �߰�
			
			
		}
		
		sl[0].setForeground(Color.RED);
		//ù���� �����̴� ���������� ����
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		int r = sl[0].getValue();
		//ù���� �����̴����� �� �޾ƿ�
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		la.setOpaque(true);//�������ϰ�
		la.setBackground(new Color(r, g, b));
		//�� ��׶��带 r,g,b ��ġ�� �°� ����
		c.add(la);
		//�� ����Ʈ�ҿ� �߰�
		setSize(300, 250);
		setVisible(true);
	}
	class MyListener implements ChangeListener {
		//���̸������� �������̽� ü����������
		public void stateChanged(ChangeEvent e) {
			//���� ü���� �޼���
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			la.setBackground(new Color(r, g, b));
			//���� ��׶��带 r,g,b ��ġ�� ��ģ ������
			sl[0].setForeground(new Color(r,0,0));
			//���ݵ� ������ ����
			sl[1].setForeground(new Color(0,g,0));
			sl[2].setForeground(new Color(0,0,b));
			
		}
	}
	public static void main(String[] args) {
		new SliderChangeEx();
	}
}