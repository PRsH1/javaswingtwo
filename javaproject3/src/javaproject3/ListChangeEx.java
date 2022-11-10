package javaproject3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ListChangeEx extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private Vector<String> v = new Vector<String>();
	//문자형 백터 클래스 v 생성
	private JList<String> nameList = new JList<String>(v);
	//문자형 JList 이름 리스트 하나 생성
	//vector가 String이므로 JList도 스트링 설정
	
	public ListChangeEx() {
		
		setTitle("ListChangeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름을 입력한 후 엔터키를 입력하세요"));
		c.add(tf);
		//컨텐트팬에 택스트 필드 생성
	    nameList.setListData(v);
	    //네밍리스트에 v에 저장된 리스트 삽입
		v.add("이승현");
		v.add("홍길동");
		//이승현,홍길동은 이름 리스트에 이미 등재됨
		nameList.setFixedCellWidth(100);
		//네임리스트의 너비를 100으로 설정
		nameList.setVisibleRowCount(5);
		//이름이 보이는 갯수를 5개로 설정
		c.add(new JScrollPane(nameList));
		//스크롤형으로 선언
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField t = (JTextField) e.getSource();//텍스트 필드로부터 소스 받아온다
				v.add(t.getText());//vector의 내용 변경
				t.setText("");//이 코드가 없으면 텍스트 필드의 값이 사라지지 않음(setText=>공백 이라는 뜻)
				nameList.setListData(v);//네임리스트에 v에 저장된 값 삽입
				
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListChangeEx();
	}
}