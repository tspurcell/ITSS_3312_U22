package Wk11_Recurssion;

public class NFactorial {

	public static void main(String[] args) {
		/*
		Implement a Java class with the var int n in main
		Implement a class method that returns the value of n! (that’s n-factorial, not n-exclamation point)
		Print the value of n! from the main method
		*/

		int n = 5;
		int factorial = getNFactorial(n);
		System.out.println("n: " + n + ", n-factorial: " + factorial);

	}
	
	public static int getNFactorial(int n) {
		if (n > 0) { // base case
			int x = n * getNFactorial(n-1); // the method calling itself (the repeating problems or task)
			System.out.println(x);
			return x;
		}
		else return 1;
	}

}
