
public class NumberPyramidPatternPrinter {

    static void printNumberPyramid(int n) {

        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print(row + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        printNumberPyramid(4);
    }
}