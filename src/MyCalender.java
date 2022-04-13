import java.util.Calendar;
import java.util.Date;

public class MyCalender {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.MONTH, -1);
        calendar.add(Calendar.DATE, 3);
        System.out.println(calendar.getTime());
    }
}
