

public class bmicalculator {

    static String getBmiStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";

        if (bmi < 25)
            return "Normal";

        if (bmi < 30)
            return "Overweight";

        return "Obese";
    }

    static void printWellnessReport(double[] height, double[] weight) {

        for (int i = 0; i < height.length; i++) {

            double bmi = weight[i] / (height[i] * height[i]);

            System.out.println(
                "Person " + (i + 1) +
                " BMI: " + bmi +
                " " + getBmiStatus(bmi)
            );
        }
    }

    public static void main(String[] args) {

        double[] height = {1.75, 1.60, 1.80, 1.65, 1.70};
        double[] weight = {70, 90, 85, 55, 100};

        printWellnessReport(height, weight);
    }
}