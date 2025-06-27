class Solution {
    public boolean checkZeroOnes(String s) {
        int maxZeros = 0;
        int maxOnes = 0;
        int currZeros = 0;
        int currOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                currZeros++;
                currOnes = 0;
            } else {
                currOnes++;
                currZeros = 0;
            }
            maxZeros = Math.max(maxZeros, currZeros);
            maxOnes = Math.max(maxOnes, currOnes);
        }
        return maxOnes > maxZeros;
    }
}
