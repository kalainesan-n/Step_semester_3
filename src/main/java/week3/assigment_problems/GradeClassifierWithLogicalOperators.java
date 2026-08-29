
public class GradeClassifierWithLogicalOperators {

    static void classifyWithAttendance(int marks, int attendance) {

        if (attendance < 75 || marks < 40) {

            System.out.println("Detained");

        } else if (marks >= 90) {

            System.out.println("Grade: A");

        } else if (marks >= 75) {

            System.out.println("Grade: B");

        } else if (marks >= 60) {

            System.out.println("Grade: C");

        } else {

            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {

        classifyWithAttendance(82, 80);
        classifyWithAttendance(91, 60);
    }
}