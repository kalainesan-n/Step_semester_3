import java.util.*;import java.time.*;
public class StreamingPlanRenewalReminder { public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();while(n-->0){String x=s.next(),name=s.next();LocalDate d=LocalDate.parse(s.next());System.out.println(name+": "+d.plusDays(x.equals("BASIC")?30:x.equals("STANDARD")?90:365));} } }
