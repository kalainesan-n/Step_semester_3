import java.util.*;
public class FactorialCalculation { public static void main(String[] args) { Scanner sc=new Scanner(System.in);while(sc.hasNextInt()){int n=sc.nextInt();long f=1;for(int i=2;i<=n;i++)f*=i;System.out.println(f);} } }
