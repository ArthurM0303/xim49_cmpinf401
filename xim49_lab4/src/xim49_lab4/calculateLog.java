package xim49_lab4;

import javax.swing.JOptionPane;

public class calculateLog {

	public static void main(String[] args) {
		// user input
		// double result = Math.log(X)/Math.log(B);
		boolean c = false;
		while (!c) {

			String b = JOptionPane.showInputDialog("Please enter the base:");

			String x = JOptionPane.showInputDialog("Please enter the log number:");

			int B = Integer.parseInt(b);

			int X = Integer.parseInt(x);

			if (X >= 0 && B >= 1) {
				c = true;
				for (int i = 0; i <= Math.log(X) / Math.log(B); i++) {
					if (Math.pow(B, i) <= X && Math.pow(B, i + 1) > X) {
						JOptionPane.showMessageDialog(null, "Your result would be " + i);
					}
				}
				break;
			}
			JOptionPane.showMessageDialog(null, "Please enter a valid number.");
		}
	}
}
