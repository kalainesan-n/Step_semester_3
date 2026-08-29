
public class Library_ISBN_Normalizer_Validator {

    static void validateISBN(String isbn) {

        isbn = isbn.trim();

        if (isbn.length() != 13) {
            System.out.println("Invalid");
            return;
        }

        String prefix = isbn.substring(0, 3).toUpperCase();

        boolean valid = true;

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(prefix.charAt(i))) {
                valid = false;
            }
        }

        for (int i = 3; i < 13; i++) {

            if (!Character.isDigit(isbn.charAt(i))) {
                valid = false;
            }
        }

        if (valid) {

            String year = isbn.substring(3, 7);
            String catalog = isbn.substring(7, 13);

            StringBuilder result = new StringBuilder();

            result.append("[")
                    .append(prefix)
                    .append("] YEAR: ")
                    .append(year)
                    .append(" | CATALOG: ")
                    .append(catalog);

            System.out.println(result);

        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {

        validateISBN("pen2026004251");
        validateISBN("pen20AB004251");
    }
}