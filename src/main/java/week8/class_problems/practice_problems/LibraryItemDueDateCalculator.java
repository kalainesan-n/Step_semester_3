import java.util.*;import java.time.*;
public class LibraryItemDueDateCalculator { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();s.nextLine();while(n-->0){String[] p=s.nextLine().split(" ",2);String title=p[1].replace("\"","");int days=p[0].equals("BOOK")?14:p[0].equals("DVD")?7:3;System.out.println(title+": "+LocalDate.of(2023,10,26).plusDays(days));} } }
