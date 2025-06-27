import java.time.format.DateTimeFormatter;

class Solution {
    public String reformatDate(String date) {
        String[] s = date.split(" ");
        String day = s[0].substring(0, s[0].length() - 2);
        String month = s[1];
        String year = s[2];

        // Use datetime to parse mmm to MM
        DateTimeFormatter input = DateTimeFormatter.ofPattern("d MMM yyyy");
        DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return output.format(input.parse(day + " " + month + " " + year));
    }
}
