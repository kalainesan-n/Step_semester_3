import java.util.*;
public class CollegeFeeCounter { public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next(),name=s.next();double f=x.equals("DAY_SCHOLAR")?52000:x.equals("HOSTELLER")?100000:32000;t+=f;System.out.printf("%s: %.2f%n",name,f);}System.out.printf("Total Collected: %.2f%n",t);}}
