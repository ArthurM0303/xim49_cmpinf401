
package xim49_Assignment1;
import javax.swing.JOptionPane;

public class SolvePythagoreanTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sideOne = JOptionPane.showInputDialog("Please type the length of the side of the triangle:");
		
		String sideTwo = JOptionPane.showInputDialog("Please type the length of the other side of the triangle:");
                            // Create two user Input
		double x = Double.parseDouble(sideOne);
		
		double y = Double.parseDouble(sideTwo);
		                    // Convert String to integer
		double z;
		
		double a = Math.pow(x, 2);
		
		double b = Math.pow(y, 2);
		
		z = Math.sqrt(a+b);
		                   // calculate z
		z = z*100;
		
		int r = (int) Math.round(z);
		
		z = r / 100.0;
		
		String sz = Double.toString(z);
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is" + " " + sz, sz, 0);
		
		
		
		
		
	}

}
