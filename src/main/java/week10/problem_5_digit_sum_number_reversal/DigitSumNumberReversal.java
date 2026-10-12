import java.util.*;
public class DigitSumNumberReversal { public static void main(String[] args) { int n=new Scanner(System.in).nextInt(), x=n,sum=0,rev=0; while(x>0){int d=x%10;sum+=d;rev=rev*10+d;x/=10;} System.out.println("Sum of digits: "+sum);System.out.println("Reverse: "+rev); } }
