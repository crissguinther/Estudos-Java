package src.course;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercicio01 {

    public static void main(String[] args) {
        // Write a Java program to create a Date object using the Calendar class
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(sdf.format(d));
    }

}
