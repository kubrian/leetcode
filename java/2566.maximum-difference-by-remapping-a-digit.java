class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    continue;
                }
                String num1 = s.replace(String.valueOf(i), String.valueOf(j));
                int newNum = Integer.parseInt(num1);
                min = Math.min(min, newNum);
                max = Math.max(max, newNum);
            }
        }
        return max - min;
    }
}
