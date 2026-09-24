import java.util.Scanner;

public class Program_2 {
	public static void main(String[] args) {
		double d1, d2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first double value : ");

		if(!sc.hasNextDouble()){
			System.out.println("Error: Invalid input for second value. Expected a double value.");
			System.exit(0);
		}
		d1 = sc.nextDouble();
		System.out.print("Enter second double value : ");
		if(!sc.hasNextDouble()){
			System.out.println("Error: Invalid input for second value. Expected a double value.");
			System.exit(0);
		}
		d2 = sc.nextDouble();
		System.out.println("Average of both numbers : " + ((d1 + d2)/2));
		sc.close();
	}
}
