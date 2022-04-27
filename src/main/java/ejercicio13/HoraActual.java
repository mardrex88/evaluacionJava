package ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraActual {

    public static void main(String[] args) {

        Date dateTimeNow = Calendar.getInstance().getTime();
        System.out.println(new SimpleDateFormat("YYYY/MM/DD HH:MM:SS").format(dateTimeNow));

    }
}
