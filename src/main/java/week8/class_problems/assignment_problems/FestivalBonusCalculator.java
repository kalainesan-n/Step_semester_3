import java.util.*;
public class FestivalBonusCalculator { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next(),name=s.next();double sal=s.nextDouble(),b=x.equals("FULLTIME")?sal*.1:x.equals("PARTTIME")?sal*.05:2000;t+=b;System.out.printf("%s: %.2f%n",name,b);}System.out.printf("Total Bonus: %.2f%n",t);} }
