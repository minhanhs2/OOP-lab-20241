

import javax.swing.JOptionPane;

public class show2number  {

	public static void main(String[] args) {
		String str1, str2;
		String strnoti = "You've just entered: ";
		str1 = JOptionPane.showInputDialog(null,"Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strnoti += str1 + " and ";
		str2 = JOptionPane.showInputDialog(null,"Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strnoti += str2;
		JOptionPane.showMessageDialog(null, strnoti, "Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
