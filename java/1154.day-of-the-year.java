import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        // Just use library
        return LocalDate.parse(date).getDayOfYear();        
    }
}
