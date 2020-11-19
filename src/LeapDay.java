import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public class LeapDay {

    static final int START_YEAR = 1900;
    static final int END_YEAR = 2000;

    public static void main(String[] args) {
        System.out.println("Monday:" + countLeapDays(MONDAY) +
                "\nTuesday:" + countLeapDays(TUESDAY) +
                "\nWednesday:" + countLeapDays(WEDNESDAY) +
                "\nThursday:" + countLeapDays(THURSDAY) +
                "\nFriday:" + countLeapDays(FRIDAY));
    }

    public static boolean isLeapDay(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static DayOfWeek getLeapDayOfWeek(int year) {
        LocalDate date = LocalDate.of(year, 2, 29);
        return date.getDayOfWeek();
    }

    public static int countLeapDays(DayOfWeek dayOfWeek) {
        int count = 0;
        for (int year = START_YEAR; year <= END_YEAR; year++) {
            if (isLeapDay(year) && getLeapDayOfWeek(year) == dayOfWeek) count++;
        }
        return count;
    }

}
