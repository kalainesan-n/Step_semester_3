

import java.util.*;

public class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {

        String reverse = "";

        for (int i = customerName.length() - 1; i >= 0; i--)
            reverse += customerName.charAt(i);

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " +
                reverseCustomerName(customerName));

        sc.close();
    }
}