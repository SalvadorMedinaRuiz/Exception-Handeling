import java.util.Scanner;
public class Division3WithException {
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter 2 integers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		
		try {		
			if (num2==0) {
				throw new ArithmeticException("Cannnot divide by Zero!"); //does the same stuff as the bottom system.out.print but manually. if #/0 causes an error, causes an exception
			}
			System.out.println(num1 + " divided by " + num2 + " = " + //if #/0 causes an error, causes an exception
					(num1 / num2));
		}
		catch (ArithmeticException ex) { //catches the exception from the try block and handles it
			System.out.println("Exception: divisor cannot be zero.");
			System.out.println(ex.getMessage()); //gets the cause of the exception and prints it out
		}
		
		System.out.println("Last part of the program...");
		scan.close();

	}

}

//if (num2 == 0)
//	throw new ArithmeticException("Cannot divide by zero!");