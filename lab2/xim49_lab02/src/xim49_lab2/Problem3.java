package xim49_lab2;
import javax.swing.JOptionPane;
public class Problem3 {

	public static void main(String[] args) {
		String d = JOptionPane.showInputDialog("Please enter the amount of money(dollar from 1~9999)");
		
		int b = Integer.parseInt(d);
		
		int gr = (int) (b/1000);
		
		b = b%1000;
		
		int be = (int)b/100;
		
		b = b%100;
		
		int sa = (int) b/10;
		
		b = (int) b%10;
		
		JOptionPane.showMessageDialog(null,"Your total amount of money has:\n" + gr + " grands\n" + be + " Benjamins\n" + sa + " sawbucks\n" + b + " bucks " );
		
		
		

	}

}
