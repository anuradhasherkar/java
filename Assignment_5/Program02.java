import java.util.Scanner;

public class Program02 {
	
	public static boolean pali(StringBuilder sb) {
		String temp = sb.substring(0);
		int i = 0;
		int j = sb.length()-1;
		while(i < j) {
			char ch;
			ch = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;
			j--;
		}
		if(temp.equals(sb.toString())) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.print("Enter string : ");
		String s = sc.next();
		sb.append(s);
		if(Program02.pali(sb)) {
			System.out.println("It is a palindrome string");
		}
		else {
			System.out.println("Not a palindrome string");
		}
		sc.close();
	}

}
