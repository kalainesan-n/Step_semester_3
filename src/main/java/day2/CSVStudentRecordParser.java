

import java.util.*;

public class CSVStudentRecordParser {

    static void parseStudentRecord(String csvLine) {

        String[] data = csvLine.split(",");

        if (data.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + data[0] +
                           " | Roll No: " + data[1] +
                           " | Dept: " + data[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter record: ");
        String csvLine = sc.nextLine();

        parseStudentRecord(csvLine);

        sc.close();
    }
}