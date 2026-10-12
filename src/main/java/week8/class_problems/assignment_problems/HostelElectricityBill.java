import java.util.*;
public class HostelElectricityBill { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next();double u=s.nextDouble(),r;if(x.equals("SINGLE"))r=8*u;else if(x.equals("SHARED"))r=6*u/s.nextInt();else r=10*u+200;t+=r;System.out.printf("%s: %.2f%n",x,r);}System.out.printf("Total: %.2f%n",t);} }
