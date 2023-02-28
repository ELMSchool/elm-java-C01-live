package day_01;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class CurrentDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
//        System.out.println("Today is: " + dayOfWeek);
    }
}
