package xim49_lab5;

import java.util.Random;

import javax.swing.JOptionPane;

public class roller {

	public static void main(String[] args) {
		Random ran = new Random();

		RollDice d1 = new RollDice();
		RollDice d2 = new RollDice();
		String num = JOptionPane.showInputDialog(null, "How many times do you want to roll?");
		int rnum = Integer.parseInt(num);
		d1.setTimes(rnum);

		boolean c = false;

		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		int count11 = 0;
		int count12 = 0;

		while (c != true) {
			for (int i = 1; i <= d1.getTimes(); i++) {
				d1.setRandom((int) ran.nextInt(6) + 1);
				d2.setRandom((int) ran.nextInt(6) + 1);
				int sum = d1.getRandom() + d2.getRandom();
				if (sum == 2) {
					count2 += 1;
				}
				if (sum == 3) {
					count3 += 1;
				}
				if (sum == 4) {
					count4 += 1;
				}
				if (sum == 5) {
					count5 += 1;
				}
				if (sum == 6) {
					count6 += 1;
				}
				if (sum == 7) {
					count7 += 1;
				}
				if (sum == 8) {
					count8 += 1;
				}
				if (sum == 9) {
					count9 += 1;
				}
				if (sum == 10) {
					count10 += 1;
				}
				if (sum == 11) {
					count11 += 1;
				}
				if (sum == 12) {
					count12 += 1;
				}
			}
			JOptionPane.showMessageDialog(null, "Your fraction of each of the values are: \n" + "2: " + count2 + "/"
					+ rnum + "\n" + "3: " + count3 + "/" + rnum + "\n" + "4: " + count4 + "/" + rnum + "\n" + "5: "
					+ count5 + "/" + rnum + "\n" + "6: " + count6 + "/" + rnum + "\n" + "7: " + count7 + "/" + rnum
					+ "\n" + "8: " + count8 + "/" + rnum + "\n" + "9: " + count9 + "/" + rnum + "\n" + "10: " + count10
					+ "/" + rnum + "\n" + "11: " + count11 + "/" + rnum + "\n" + "12: " + count12 + "/" + rnum + "\n");

			String tof = JOptionPane.showInputDialog("Do you want to roll the dice again? Yes/No: ");
			if (tof.equalsIgnoreCase("No")) {
				c = true;
			} else {

			}

		}

	}

}	
	
	


