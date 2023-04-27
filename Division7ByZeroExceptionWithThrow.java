import java.util.Scanner;
public class Division7ByZeroExceptionWithThrow {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			boolean exception = false;
			int quotient = 0;
			do {
				System.out.print("Enter two integers to divide: ");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();

				try { //checks for an exception
					quotient = divide(num1, num2); //if you do get an exception, skips exception=false and goes to catch, where exception remains true
					exception = false;
				}
				catch (ArithmeticException ex) {  //catches the exception and handles it
					System.out.println(ex);
					System.out.println("Invalid divisor. Try again...");
					exception = true;
				}
				
			}while (exception);
			System.out.println("Quotient = " + quotient);
			scan.close();

		}

	public static int divide(int n1, int n2) { //you dont have to put "throws ArithmeticException" at the end because it is unchecked
		if (n2 == 0)
			throw new ArithmeticException("Divide by zero.");
		return n1/n2;
	}
}
