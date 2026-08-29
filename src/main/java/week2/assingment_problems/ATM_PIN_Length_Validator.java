

public class ATM_PIN_Length_Validator {

    static void validatePIN(String pin) {

        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {

        validatePIN("482");
        validatePIN("4820");
    }
}