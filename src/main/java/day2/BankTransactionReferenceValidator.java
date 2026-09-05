package day2;

import java.util.*;

public class BankTransactionReferenceValidator {

    static String normalizeReference(String raw) {

        raw = raw.trim();

        String bank = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return bank + rest;
    }

    static String validateAndFormat(String reference) {

        if (reference.length() != 14)
            return "Invalid: wrong length";

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i)))
                return "Invalid: bank code must be 3 letters";
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i)))
                return "Invalid: body must contain digits";
        }

        String bank = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String seq = reference.substring(9);

        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(bank);
        result.append("] DATE: ");
        result.append(date.substring(0, 2));
        result.append("/");
        result.append(date.substring(2, 4));
        result.append("/");
        result.append(date.substring(4));
        result.append(" | SEQ: ");
        result.append(seq);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter reference: ");
        String raw = sc.nextLine();

        String reference = normalizeReference(raw);

        System.out.println(validateAndFormat(reference));

        sc.close();
    }
}