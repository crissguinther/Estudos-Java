package ExerciciosDateCalendar.src;

import java.util.Calendar;
import java.util.Date;

public class Exercicio02 {
    public static void main(String[] args) {
        // Write a Java program to get and display information (year, month, day, hour,
        // minute) of a default calendar

        Calendar cal = Calendar.getInstance();
        Date day = cal.getTime();

        System.out.println(day);

    }
}
