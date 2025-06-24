class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            // Lazy, else use boolean map/array
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                res++;
            }
        }
        return res;
    }
}
