import java.util.*;
public class CampusParkingChargeCalculator { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next();int h=s.nextInt();double r=x.equals("BIKE")?10*h:x.equals("CAR")?30+20*(h-1):Math.max(100,50*h);t+=r;System.out.printf("%s: %.2f%n",x,r);}System.out.printf("Total: %.2f%n",t);} }
