import javax.swing.JOptionPane;

public class ex225 { 
	public static void main(String[] args) {
			String str1, str2;
			str1 = JOptionPane.showInputDialog(null,
					"Please input the first number: ", 
					"Input the first number", 
					JOptionPane.INFORMATION_MESSAGE);
			str2 = JOptionPane.showInputDialog(null,
					"Please input the second number: ", 
					"Input the second number: ", 
					JOptionPane.INFORMATION_MESSAGE);
			double num1 = Double.parseDouble(str1);
			double num2 = Double.parseDouble(str2);
			
			
			String strnoti = "Sum: ";
			strnoti += (num1 + num2);
			strnoti += "\nDifference: " + (num1 - num2);
			strnoti += "\nProduct: " + (num1 * num2);
			if (num2 == 0.0) {
				strnoti += "\nCan not devide by zero";
			}
			else {strnoti += "\nQuotient: " + (num1/num2);}
			JOptionPane.showMessageDialog(null, strnoti,
					"Show 2 numbers calculate sum, difference, product, and quotient", 
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}


