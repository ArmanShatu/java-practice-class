import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateDifference {
    public static void main(String[] args) throws ParseException {
        String thatDay = "15/08/2020 01:15:47 PM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1 = formatter.parse(thatDay);
        Date date2 = new Date();
        long d = date2.getTime() - date1.getTime();
        long year = d/(1000l * 60 * 60 * 24 * 365);
        long day = d/(1000 * 60 * 60 * 24) % 365;
        long hour = (d/(1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60) % 60);
        long second = (d / 1000) % 60;

        System.out.println("year "+ year);
        System.out.println("day " + day);
        System.out.println("hour " + hour);
        System.out.println("minutes " + minutes);
        System.out.println("second " + second);
    }
}
