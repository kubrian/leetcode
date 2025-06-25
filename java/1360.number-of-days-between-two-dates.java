import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        // Use library
        return (int) Math
                .abs(LocalDate.parse(date1).until(LocalDate.parse(date2), ChronoUnit.DAYS));
    }
}
