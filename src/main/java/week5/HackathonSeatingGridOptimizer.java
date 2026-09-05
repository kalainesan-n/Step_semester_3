package week5;

public class HackathonSeatingGridOptimizer {

    static double rowAverage(int[] row) {

        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum = sum + row[i];
        }

        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {

        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {

            double average = rowAverage(seatingScores[i]);

            if (average < threshold) {
                result = result + "Row " + i + ": Quiet Zone";
            } else {
                result = result + "Row " + i + ": Buzzing Zone";
            }

            if (i < seatingScores.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] seatingScores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };

        System.out.println(classifyRows(seatingScores, 60));
    }
}
