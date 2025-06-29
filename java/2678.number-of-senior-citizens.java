import java.util.Arrays;

class Solution {
    public int countSeniors(String[] details) {
        return (int) Arrays.stream(details).filter(s -> Integer.parseInt(s.substring(11, 13)) > 60)
                .count();
    }
}
