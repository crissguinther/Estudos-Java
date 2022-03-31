package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws Exception {

        // Classe SimpleDateFormat serve para formatar uma data em um formato específico
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Utiliza-se o SimpleDateFormat para definir o timezone como GMT, fazendo uso,
        // também, da classe de mesmo nome
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        // Aqui é utilizado o SimpleDateFormat para fazer um parse de uma data
        // específica e armazena-lá numa variavel do tipo Date
        Date y1 = sdf1.parse("31/03/2022");
        Date y2 = sdf2.parse("07/02/2023 10:31:52");

        // Padrao ISO 8601
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("--------------------");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("--------------------");
        System.out.println("sdf1.format: " + sdf1.format(y1));
        System.out.println("sdf2.format: " + sdf2.format(y2));

        System.out.println("------GMT(UTC)------");

        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("--------------------");
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
        System.out.println("--------------------");

    }
}
