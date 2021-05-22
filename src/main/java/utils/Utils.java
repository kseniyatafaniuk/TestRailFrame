package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getGeneratedName(String name) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMM_HH:mm:ss");
        return name + formatter.format(date).toString();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
