package javaproject3;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	
	private JLabel la = new JLabel(" COLORED LABEL ");
	private JSlider[] sl = new JSlider[3];
	//슬라이더 3개 생ㅇ성
	
	MyListener listener=new MyListener();
	public SliderChangeEx() {
		//슬라이더 체인지 메소드
		
		setTitle("SliderChangeEx");
		//타이틀은 슬라이더 체인지
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//컨텐트 팬 생성
		c.setLayout(new FlowLayout());
		
		for(int i=0; i<sl.length; i++) {
			
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			//RGB 최소 0 최대 255 중간 128 가호로(슬라이더 모양)
			sl[i].setPaintTrack(true);
			//setPaintTrack(boolean b)	b가 true이면 슬라이더의 트랙을 보이게 하고 
			//b가 false이면 감춘다.
			sl[i].setPaintTicks(true);
			//눈금자
			sl[i].setMajorTickSpacing(50);//큰 눈금자 간격 설정
			sl[i].setMinorTickSpacing(10);//작은 눈금자 간격 설정
			sl[i].setPaintLabels(true);//큰 눈금자 기준으로 숫자 생성
			sl[i].addChangeListener(new MyListener());
			//sl[i].addChangeListener(listener);로 해도 됨
		    //위에 객체 생성 시
			
			c.add(sl[i]);
			//컨텐트팬에 추가
			
			
		}
		
		sl[0].setForeground(Color.RED);
		//첫번쨰 슬라이더 빨간색으로 설정
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		int r = sl[0].getValue();
		//첫번쨰 슬라이더에서 값 받아옴
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		la.setOpaque(true);//불투명하게
		la.setBackground(new Color(r, g, b));
		//라벨 백그라운드를 r,g,b 수치에 맞게 설정
		c.add(la);
		//라벨 컨텐트팬에 추가
		setSize(300, 250);
		setVisible(true);
	}
	class MyListener implements ChangeListener {
		//마이리스너의 인터페이스 체인지리스너
		public void stateChanged(ChangeEvent e) {
			//상태 체인지 메서드
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			la.setBackground(new Color(r, g, b));
			//라벨의 백그라운드를 r,g,b 수치를 합친 값으로
			sl[0].setForeground(new Color(r,0,0));
			//눈금도 색깔이 변함
			sl[1].setForeground(new Color(0,g,0));
			sl[2].setForeground(new Color(0,0,b));
			
		}
	}
	public static void main(String[] args) {
		new SliderChangeEx();
	}
}