import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public String[] shortestSubstrings(String[] arr) {

        // Init answer
        String[] answer = new String[arr.length];
        Arrays.fill(answer, "");

        // Create SortedSet for each string to store all substrings.
        ArrayList<ArrayList<String>> substrings = new ArrayList<>();

        // Create map to store total unique occurrences.
        Map<String, Integer> allSubstring = new HashMap<>();

        // Iterate through strings
        for (int i = 0; i < arr.length; i++) {
            String curr = arr[i];
            SortedSet<String> currSet = new TreeSet<>((x, y) -> {
                int diff = Integer.compare(x.length(), y.length());
                return diff != 0 ? diff : x.compareTo(y);
            });

            // Iterate through all substrings.
            for (int length = 1; length <= curr.length(); length++) {
                for (int start = 0; start + length <= curr.length(); start++) {
                    currSet.add(curr.substring(start, start + length));
                }
            }

            // Add into global count of occurrences
            ArrayList<String> currCandidates = new ArrayList<>();

            for (String substr : currSet) {
                int newCount = allSubstring.getOrDefault(substr, 0) + 1;
                allSubstring.put(substr, newCount);
                if (newCount == 1) {
                    currCandidates.add(substr);
                }
            }
            substrings.add(currCandidates);
        }

        // Iterate through strings
        for (int i = 0; i < answer.length; i++) {
            // Iterate through all substrings
            for (String sub : substrings.get(i)) {
                // If sub is length 2 or above, then continue.
                if (allSubstring.get(sub) == 1) {
                    answer[i] = sub;
                    break;
                }
            }
        }
        return answer;
    }
}
