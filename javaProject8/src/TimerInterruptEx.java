import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnableTwo implements Runnable {
	private JLabel timerLabel;
	public TimerRunnableTwo(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
public class TimerInterruptEx extends JFrame {
	private Thread th;
	public TimerInterruptEx() {
		setTitle("TimerInterruptEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		TimerRunnableTwo runnable = new TimerRunnableTwo(timerLabel);
		th = new Thread(runnable);
		th.start();
		setSize(300, 170);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TimerInterruptEx();
	}
}
