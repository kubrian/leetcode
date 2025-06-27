class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        String num = sb.toString();
        for (int i = 0; i < k; i++) {
            num = Integer.toString(num.chars().map(c -> c - '0').sum());
        }
        return Integer.parseInt(num);

    }
}
