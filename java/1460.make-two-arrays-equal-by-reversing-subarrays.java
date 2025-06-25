class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // since nums are [1,1000]
        int[] count = new int[1001];
        for (int num : target) {
            count[num]++;
        }        
        for (int num : arr) {
            count[num]--;
            // Does not exist in target
            if (count[num] < 0) {
                return false;
            }
        }
        return true;
    }
}
