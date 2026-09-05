
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeatingChar(String s) {

        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i)] == 1)
                return s.charAt(i);

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = sc.nextLine();

        char result = findFirstNonRepeatingChar(s);

        if (result == '\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println("First Non-Repeating Character: " + result);

        sc.close();
    }
}