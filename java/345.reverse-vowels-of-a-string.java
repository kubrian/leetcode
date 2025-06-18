class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!isVowel(s.charAt(left))) {
                left++;
            } else if (!isVowel(s.charAt(right))) {
                right--;
            } else {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
