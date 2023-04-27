import java.util.Scanner;
public class Division6WithExceptionAndMethod {
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter 2 integers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		try {		
			System.out.println(num1 + " divided by " + num2 + " = " +
					quotient(num1, num2));
		}
		catch (ArithmeticException ex) {
			System.out.println("Exception: divisor cannot be zero.");
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Last part of the program...");
		scan.close();

	}
	
	public static int quotient(int n1, int n2) {
		if (n2 == 0)
			throw new ArithmeticException("Cannot divide by zero!");
		return n1/n2;
	}

}
