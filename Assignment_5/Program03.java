import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any line : ");
		String str = sc.nextLine();
		String temp = str.trim();
		int i = -1;
		int j = 0;
		int cnt = 0;
		while(j < temp.length()) {
			if(i == -1 || temp.charAt(i) == ' ') {
				if(temp.charAt(j) != ' ') {
					cnt++;
				}
			}
			i++;
			j++;
		}
		System.out.println("Total Words : " + cnt);
		sc.close();
	}
}