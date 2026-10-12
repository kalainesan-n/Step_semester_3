import java.util.*;
public class InPlaceArrayReversal { public static void main(String[] args) { Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int[] a = new int[n]; for (int i=0;i<n;i++) a[i]=sc.nextInt(); for(int i=0,j=n-1;i<j;i++,j--){int t=a[i];a[i]=a[j];a[j]=t;} System.out.println(Arrays.toString(a)); } }
