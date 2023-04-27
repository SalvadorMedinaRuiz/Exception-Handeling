
import java.util.*;

public class InputMismatchExceptionDemo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    boolean continueInput = true;

	    do {
	      try {
	        System.out.print("Enter an integer: ");
	        int number = input.nextInt(); //if an exception occurs, skips bottom code and goes to catch
	  
	        // Display the result
	        System.out.println(
	          "The number entered is " + number);
	        
	        continueInput = false;
	      } 
	      catch (InputMismatchException ex) {
	        System.out.println("Try again. (" + 
	          "Incorrect input: an integer is required)");
	        input.nextLine(); // discard input so nextInt is empty next time it asks for it
	      }
	    } while (continueInput);
	  

	}
}
