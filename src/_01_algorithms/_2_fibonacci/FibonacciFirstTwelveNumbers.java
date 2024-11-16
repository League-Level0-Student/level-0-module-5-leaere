package _01_algorithms._2_fibonacci;

public class FibonacciFirstTwelveNumbers {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum;
		
		System.out.print(num1 + " " + num2 + " ");
		
		for(int count = 0; count < 98; count++) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
			
		}
	}
}