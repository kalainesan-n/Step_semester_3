public class StudentPlacementRecordManagement {

    static class PlacementRecord {

        String studentName;
        String company;
        double packageLpa;

        PlacementRecord(String studentName, String company, double packageLpa) {
            this.studentName = studentName;
            this.company = company;
            this.packageLpa = packageLpa;
        }

        void printRecord() {
            System.out.println(studentName + " -> " + company + " @ "
                    + packageLpa + " LPA");
        }
    }

    public static void main(String[] args) {

        PlacementRecord student1 = new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord student2 = new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord student3 = new PlacementRecord("Karthik", "Infosys", 4.0);

        PlacementRecord[] placementRecords = {student1, student2, student3};

        for (int i = 0; i < placementRecords.length; i++) {
            placementRecords[i].printRecord();
        }
    }
}
