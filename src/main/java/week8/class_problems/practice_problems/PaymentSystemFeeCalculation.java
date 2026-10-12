import java.util.*;
public class PaymentSystemFeeCalculation { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();double t=0;while(n-->0){String x=s.next();double v=s.nextDouble(),r=v*(x.equals("CARD")?1.02:x.equals("WALLET")?1.01:1);t+=r;System.out.printf("%s: %.2f%n",x,r);}System.out.printf("Total: %.2f%n",t);} }
