import java.util.*;
public class WordReverserPalindromeChecker { public static void main(String[] args) { Scanner sc = new Scanner(System.in); while (sc.hasNext()) { String word = sc.next(); String reverse = new StringBuilder(word).reverse().toString(); System.out.println(reverse + (word.equals(reverse) ? " - palindrome" : " - not a palindrome")); } } }
