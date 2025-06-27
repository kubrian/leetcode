import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob,
            String leaveBob) {
        // Dates are in MM-DD and are inclusive of bounds
        // Use library methods to compare dates
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        long aA = LocalDate.parse("2019-" + arriveAlice, dtf).toEpochDay();
        long lA = LocalDate.parse("2019-" + leaveAlice, dtf).toEpochDay();
        long aB = LocalDate.parse("2019-" + arriveBob, dtf).toEpochDay();
        long lB = LocalDate.parse("2019-" + leaveBob, dtf).toEpochDay();

        return (int) Math.max(Math.min(lA, lB) - Math.max(aA, aB) + 1, 0);
    }
}
