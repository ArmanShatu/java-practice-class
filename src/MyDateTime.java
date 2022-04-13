import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long timestamp = date.getTime();
        System.out.println(timestamp);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy hh:mm:ss aa");
        String todaysDate = formatter.format(timestamp);
//        String todaysDate = formatter.format(date);
        System.out.println(todaysDate);
    }
}
