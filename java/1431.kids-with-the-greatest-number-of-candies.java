import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(c -> c + extraCandies >= maxCandies)
                .collect(Collectors.toList());
    }
}
