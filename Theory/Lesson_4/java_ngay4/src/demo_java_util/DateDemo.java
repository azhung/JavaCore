package demo_java_util;

/* DateDemo.java
 *Created on April 19, 2008, 10:50 AM
 */



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class DateDemo {
    
    public DateDemo() {
    }
    
    public static void main(String[] args) {
        Date today = new Date();

        System.out.println(today.getYear()+1900);
        
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));

        //Dinh dang ngay thang
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
        String s = sdf.format(today);
        System.out.println(s);

        int date = today.getDate();
        System.out.println(date);
        
        //vi du ve so ngau nhien su dung doi tuong Ramdom
        Random r = new Random();
        System.out.println(r.nextInt(10));
        
        
    }
    
}
