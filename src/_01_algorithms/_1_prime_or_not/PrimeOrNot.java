package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		String userNum = JOptionPane.showInputDialog("Please enter a number.");
		
		int userNumInt = Integer.parseInt(userNum);
		
		for(int count = 2; count < userNumInt; count++) {
			if(userNumInt % count == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime.");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your number is prime.");
		
	}
}
