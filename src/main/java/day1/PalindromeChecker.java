

import java.util.*;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }

        return true;
    }

    static boolean isPalindromeRecursive(String s) {

        if (s.length() <= 1)
            return true;

        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        return isPalindromeRecursive(
            s.substring(1, s.length() - 1)
        );
    }

    static boolean isPalindromeArrayReversal(String s) {

        char[] a = s.toCharArray();

        for (int i = 0; i < a.length / 2; i++) {

            char temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        return s.equals(new String(a));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = sc.nextLine();

        System.out.println(isPalindromeIterative(s));
        System.out.println(isPalindromeRecursive(s));
        System.out.println(isPalindromeArrayReversal(s));

        sc.close();
    }
}