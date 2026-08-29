

public class MultiplicationTableGenerator {

    static void generateFirstValidTable(int[] candidates) {

        for (int number : candidates) {

            if (number < 1) {

                System.out.println(
                        "Skipping invalid number: " + number
                );

                continue;
            }

            for (int i = 1; i <= 10; i++) {

                System.out.println(
                        number + " x " + i + " = " + (number * i)
                );
            }

            break;
        }
    }

    public static void main(String[] args) {

        int[] candidates = {-3, 0, 7, 9};

        generateFirstValidTable(candidates);
    }
}