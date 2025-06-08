class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Trivial case
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (true) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (j >= strs[i].length() || j >= strs[i + 1].length() || strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(j++));
        }
    }
}