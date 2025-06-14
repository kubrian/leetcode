import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(strs, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
        if (strs[0].equals("0")) {
            return "0";
        }
        return String.join("", strs);
    }
}
