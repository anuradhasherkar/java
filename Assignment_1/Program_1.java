import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		System.out.println("Given Number : " + num);
		System.out.println("Binary Equivalent : " + Integer.toBinaryString(num));
		System.out.println("Binary Equivalent : " + Integer.toOctalString(num));
		System.out.println("Binary Equivalent : " + Integer.toHexString(num));
		sc.close();
	}

}
