import java.util.*;
public class PrimeNumberChecker { public static void main(String[] args) { Scanner sc=new Scanner(System.in); while(sc.hasNextInt()){int n=sc.nextInt();boolean prime=n>1;for(int i=2;i*i<=n;i++)if(n%i==0)prime=false;System.out.println(n+(prime?" is prime":" is not prime"));} } }
