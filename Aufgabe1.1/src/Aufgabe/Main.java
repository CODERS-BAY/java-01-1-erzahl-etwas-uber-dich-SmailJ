package Aufgabe;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        int age=22;
        String firstName="Smail";
        char gender='M';
        String lastName="Jusic";
        double grade=2.7;
        boolean married=false;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        Date date = simpleDateFormat.parse("05.09.1997");

        System.out.println(age);
        System.out.println(firstName);
        System.out.println(gender);
        System.out.println(lastName);
        System.out.println(simpleDateFormat.format(date));
        System.out.println(grade);
        System.out.println(married);
    }
}
