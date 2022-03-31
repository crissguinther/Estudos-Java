package course;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Write a Java program to get the name of the first and last day of a month

        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.print("Enter the month number: ");
        Integer monthVal = scanner.nextInt();

        Date[] date = setMonth(monthVal);

        String[] daysOfWeek = new String[] { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

        calendar.setTime(date[0]);

        System.out.println("Primeiro dia do mês: " + daysOfWeek[calendar.get(Calendar.DAY_OF_WEEK)]);

        calendar.setTime(date[1]);

        System.out.println("Ultimo dia do mês: " + daysOfWeek[calendar.get(Calendar.DAY_OF_WEEK)]);

        scanner.close();

    }

    private static Date[] setMonth(Integer n) {
        Calendar cal = Calendar.getInstance();
        String month = (n.compareTo(10) < 0) ? "0" + String.valueOf(n) : String.valueOf(n);
        String year = String.valueOf(cal.get(Calendar.YEAR));

        Date firstDayMonth = Date.from(Instant.parse(year + "-" + month + "-01T00:00:00Z"));
        Date lastDayMonth = Date
                .from(Instant.parse(year + "-" + month + "-"
                        + String.valueOf(cal.getActualMaximum(Calendar.DAY_OF_MONTH)) + "T00:00:00Z"));

        Date[] date = new Date[] {
                firstDayMonth,
                lastDayMonth
        };

        return date;
    }
}
