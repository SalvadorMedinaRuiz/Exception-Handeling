import java.util.Scanner;
public class Division1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter 2 integers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1 + " divided by " + num2 + " = " +
					(num1 / num2));
		
		scan.close();
	}

}
