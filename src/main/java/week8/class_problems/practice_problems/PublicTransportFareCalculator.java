import java.util.*;
public class PublicTransportFareCalculator { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next();double d=s.nextDouble(),r=x.equals("BUS")?Math.min(10,2+.1*d):x.equals("TRAIN")?3+.15*d:(1.5+.2*d)*s.nextDouble();t+=r;System.out.printf("%s: %.2f%n",x,r);}System.out.printf("Total: %.2f%n",t);} }
