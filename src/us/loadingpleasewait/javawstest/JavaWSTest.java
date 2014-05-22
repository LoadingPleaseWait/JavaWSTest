package us.loadingpleasewait.javawstest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JavaWSTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JLabel("Hello, world!", SwingConstants.CENTER));
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
