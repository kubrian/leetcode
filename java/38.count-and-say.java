class Solution {
    public String countAndSay(int n) {
        String[] res = new String[n + 1];
        res[1] = "1";
        for (int i = 2; i <= n; i++) {
            String prev = res[i - 1];
            StringBuilder sb = new StringBuilder();
            char curr = prev.charAt(0);
            int rep = 1;
            for (int j = 1; j < prev.length(); j++) {
                if (curr != prev.charAt(j)) {
                    sb.append(rep);
                    sb.append(curr);
                    curr = prev.charAt(j);
                    rep = 1;
                } else {
                    rep++;
                }
            }
            sb.append(rep);
            sb.append(curr);
            res[i] = sb.toString();
        }
        return res[n];
    }

}
