import java.util.*;
public class StudentGradeAssignment { public static void main(String[] args) { Scanner sc=new Scanner(System.in);while(sc.hasNextInt()){int m=sc.nextInt();char g=m>=90?'A':m>=75?'B':m>=60?'C':m>=40?'D':'F';System.out.println("Grade "+g);} } }
