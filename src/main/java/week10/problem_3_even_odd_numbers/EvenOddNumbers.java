import java.util.*;
public class EvenOddNumbers { public static void main(String[] args) { Scanner sc = new Scanner(System.in); int even = 0, odd = 0; while (sc.hasNextInt()) if (sc.nextInt() % 2 == 0) even++; else odd++; System.out.println("Even: " + even); System.out.println("Odd: " + odd); } }
