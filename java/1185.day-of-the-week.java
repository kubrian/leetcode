import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String res = LocalDate.of(year, month, day).getDayOfWeek().toString().toLowerCase();
        return res.substring(0, 1).toUpperCase() + res.substring(1);
    }
}
