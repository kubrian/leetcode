class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i + 1 < arr.length; i++) {
            if ((arr[i + 1] - arr[i]) % 2 == 0) {
                if (arr[i + 1] < arr[i]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    return new String(arr);
                }
            }
        }
        return new String(arr);
    }
}
