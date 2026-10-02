import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int special = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                special++;
            }
        }

        System.out.println("\nStatistics");
        System.out.println("Vowels      : " + vowels);
        System.out.println("Consonants  : " + consonants);
        System.out.println("Digits      : " + digits);
        System.out.println("Spaces      : " + spaces);
        System.out.println("Special     : " + special);

        sc.close();
    }
}
