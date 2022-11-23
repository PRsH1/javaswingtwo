import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
class FlickeringLabel extends JLabel implements Runnable {
	private long delay; 
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		this.setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		boolean flag=true;//ppt에서는 n=0으로 설정하고 1이면 깜빡이는 식으로 했지만 true false로 해도 됨(코드가 간결해짐)
		while(true) {
			if(flag)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			flag=!flag;
			try {
				Thread.sleep(delay); 
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		FlickeringLabel fLabel = 
				new FlickeringLabel("깜박", 500);
		JLabel label = new JLabel("안깜박");
		FlickeringLabel fLabel2 = 
				new FlickeringLabel("깜박", 300);
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
