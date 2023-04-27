
import java.util.*;

public class InputMismatchExceptionDemo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter an integer: ");
			int number = input.nextInt();

			// Display the result
			System.out.println(
					"The number entered is " + number);

		} 
		catch (InputMismatchException ex) {
			System.out.println("Incorrect input: an integer is required");
		}
	}
}
