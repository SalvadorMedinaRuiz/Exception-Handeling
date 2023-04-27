import java.util.*;
public class Method3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean done = false;
		while (!done)
		{
			System.out.print("How many scores? ");
			try 
			{
				int count = scan.nextInt();
				System.out.println("Average = " + getAverage(count, scan));
				done = true;
			}
			catch (InputMismatchException ex)
			{
				System.out.println(ex.getMessage());
				System.out.println("Non-integer input.");
				scan.nextLine();
			}
		}
	}
	
	public static double getAverage(int count, Scanner scan)
	{
		int sum = 0;
		int i=0; 
		while (i<count)
		{
			try
			{
				System.out.print("Enter score[" + (i+1) + "]: ");
				sum += scan.nextInt();
				i++;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Non-integer score. Try again.");
				scan.nextLine();
			}
		}
		return (double)sum/count;
	}

}
