public class LoginAttemptSimulatorWithBreak {

    static void simulateLogin(String correctCode, String[] attempts) {

        for (int i = 0; i < attempts.length; i++) {

            if (attempts[i].equals(correctCode)) {

                System.out.println(
                        "Access granted on attempt " + (i + 1)
                );

                break;
            }

            if (i == attempts.length - 1) {
                System.out.println(
                        "Access denied — all attempts used"
                );
            }
        }
    }

    public static void main(String[] args) {

        String[] attempts1 = {"0000", "1234", "9999"};

        String[] attempts2 = {"1111", "2222", "3333"};

        simulateLogin("1234", attempts1);
        simulateLogin("1234", attempts2);
    }
}