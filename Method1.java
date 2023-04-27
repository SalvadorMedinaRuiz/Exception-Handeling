import java.util.*;
/** Example code to illustrate exception handling
 * 
 * @author ElsaPoh
 *
 */
public class Method1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("How many scores? ");
		int count = scan.nextInt();
		System.out.println("Average = " + getAverage(count, scan));
	}
	
	public static double getAverage(int count, Scanner scan)
	{
		int sum = 0;
		for (int i=0; i<count; i++)
		{
			System.out.print("Enter score[" + (i+1) + "]: ");
			sum += scan.nextInt();
		}
		return (double)sum/count;
	}

}
