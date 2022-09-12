package xim49_lab2;
import javax.swing.JOptionPane;
public class Problem2 {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		                     //define pi
		String r = JOptionPane.showInputDialog("Please type the radius of a circle:");
		                     //make user input
		double a = Double.parseDouble(r);
		
		double p = 2*PI*a;
		
		double area = PI*a*a;
		
		p = p*100;
		
		int ip = (int) Math.round(p);
		
		p = ip / 100;
		
		String sp = Double.toString(p);
		                     //round perimeter to 2 decimal
		
		area = area*100;
		
		int iarea = (int) Math.round(area);
		
		area = iarea / 100;
		
		String sarea = Double.toString(area);
		                     //round area to 2 decimal
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + r + " has an area of " + sarea + " and a perimeter of " + sp );
		
		

	}

}
