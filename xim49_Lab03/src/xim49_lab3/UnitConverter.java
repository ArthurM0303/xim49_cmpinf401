package xim49_lab3;
import javax.swing.JOptionPane;
public class UnitConverter {
	
	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Please enter a distance or weight:");
		
		int space = userInput.indexOf(" ");
		
		// System.out.println(space);
		
		String number = userInput.substring(0,space);
		String unit = userInput.substring(space+1,userInput.length());
		
		// System.out.println(number + " " + unit);
		
		double doNumber = Double.parseDouble(number);
		                                      // convert to double
		if (unit.equalsIgnoreCase("in"))
		{
			doNumber = doNumber*2.54;
			System.out.println( userInput + " = " + doNumber + "cm");
		}
		else if (unit.equalsIgnoreCase("cm"))
		{
			doNumber = doNumber%2.54;
			System.out.println( userInput + " = " + doNumber + "in");
		}
		else if (unit.equalsIgnoreCase("oz"))
		{
			doNumber = doNumber*29.5735295625;
			System.out.println( userInput + " = " + doNumber + "gm");
		}
		else if (unit.equalsIgnoreCase("gm"))
		{
			doNumber = doNumber%29.5735295625;
			System.out.println( userInput + " = " + doNumber + "oz");
		}
		else if (unit.equalsIgnoreCase("yd"))
		{
			doNumber = doNumber*0.9144;
			System.out.println( userInput + " = " + doNumber + "m");
		}
		else if (unit.equalsIgnoreCase("m"))
		{
			doNumber = doNumber%0.9144;
			System.out.println( userInput + " = " + doNumber + "yd");
		}
		else
		{
			System.out.println("Please enter a valid number with its unit.");
		}

		

	}

}
	