package src.course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AulaCalendar {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println("-------------------");

        System.out.println(sdf.format(d));

        System.out.println("--------------------");

        int dMinutes = cal.get(Calendar.MINUTE);
        int dMonth = cal.get(Calendar.MONTH + 1);

        System.out.println("dMinutes: " + dMinutes);
        System.out.println("dMonth: " + dMonth);

    }
}
