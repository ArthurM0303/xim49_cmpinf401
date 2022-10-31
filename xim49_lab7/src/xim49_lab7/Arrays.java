package xim49_lab7;

import javax.swing.JOptionPane;
import java.util.Random;

public class Arrays {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Please enter a number for how many numbers to be generated: ");
		int times = Integer.parseInt(number);
		double[] arr = new double[times];
		Random randNum = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = randNum.nextDouble();
		}
		JOptionPane.showMessageDialog(null, "Your max number is: " + max(arr));
		JOptionPane.showMessageDialog(null, "Your min number is: " + min(arr));
		JOptionPane.showMessageDialog(null, "Your sum is: " + sum(arr));
		JOptionPane.showMessageDialog(null, "Your average is: " + average(arr));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (double val : array) {
			if (val < min)
				min = val;
		}
		return min;
	}

	public static double max(double[] array) {
		double max = array[0];
		for (double val : array) {
			if (val > max)
				max = val;
		}
		return max;
	}

	public static double sum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static double average(double[] array) {
		double average = 0;
		for (double i : array)
			average += i;
		return average / array.length;
	}

}
