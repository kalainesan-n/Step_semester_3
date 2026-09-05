package week5;

import java.util.Arrays;

public class Top3PodiumFinder {

    static int[] findTopThreeScores(int[] scores) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= first) {
                third = second;
                second = first;
                first = scores[i];
            } else if (scores[i] >= second) {
                third = second;
                second = scores[i];
            } else if (scores[i] > third) {
                third = scores[i];
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {

        int[] scores = {45, 82, 79, 90, 33, 90, 61};

        System.out.println(Arrays.toString(findTopThreeScores(scores)));
    }
}
