
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDifference {
     
 public int mainly()
 {
 DateDifference difference = new DateDifference();
 System.out.print("asdfasdfasdf");
 return DateDifference();
 }
 public int DateDifference() 
 {
 Calendar cal1 = new GregorianCalendar();
 Calendar cal2 = new GregorianCalendar();

 cal1.set(1901, 1, 1); 
 cal2.set(2000, 12, 31);
 //System.out.println("Days= "+daysBetween(cal1.getTime(),cal2.getTime()));
 return daysBetween(cal1.getTime(),cal2.getTime());
 }
 public int daysBetween(Date d1, Date d2){
 return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
 }
 }