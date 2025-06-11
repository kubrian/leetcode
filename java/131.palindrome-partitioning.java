import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        boolean palin[][] = new boolean[s.length()][s.length()];
        // palin[i][j] is whether the s.substring(i, j+1) is a palindrome
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                // First and last same and middle is palindrome or empty
                palin[i][j] = s.charAt(i) == s.charAt(j) && (i + 1 > j - 1 || palin[i + 1][j - 1]);
            }
        }
        List<List<String>> res = new ArrayList<>();
        List<Integer> currPart = new ArrayList<>();
        currPart.add(0);
        travel(s, 1, currPart, res, palin);
        return res;
    }

    private void travel(String s, int currPos, List<Integer> currPart, List<List<String>> res,
            boolean[][] palin) {
        // Valid
        if (currPart.get(currPart.size() - 1) == s.length()) {
            // Add to result
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < currPart.size() - 1; i++) {
                curr.add(s.substring(currPart.get(i), currPart.get(i + 1)));
            }
            res.add(curr);
            return;
        }

        // Invalid: Partition occurs before index.
        if (currPos > s.length()) {
            return;
        }

        // DFS if last till currpos is a valid palindrome
        if (palin[currPart.get(currPart.size() - 1)][currPos - 1]) {
            currPart.add(currPos);
            travel(s, currPos + 1, currPart, res, palin);
            currPart.remove(currPart.size() - 1);
        }
        travel(s, currPos + 1, currPart, res, palin);
    }
}
