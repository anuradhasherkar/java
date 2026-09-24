import java.util.Scanner;

public class Program01 {
	
	public static void rev(StringBuilder sb) {
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
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.print("Enter string : ");
		String s = sc.next();
		sb.append(s);
		Program01.rev(sb);
		System.out.println(sb.toString());
		sc.close();
	}

}
