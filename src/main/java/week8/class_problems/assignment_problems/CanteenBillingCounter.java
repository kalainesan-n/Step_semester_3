import java.util.*;
public class CanteenBillingCounter { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next();double v=s.nextDouble();double r=x.equals("STUDENT")?v*.9:x.equals("STAFF")?v*.95:v+10;t+=r;System.out.printf("%s: %.2f%n",x,r);}System.out.printf("Total: %.2f%n",t);} }
