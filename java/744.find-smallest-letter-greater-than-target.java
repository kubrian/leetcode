class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Binary search again
        int left = 0;
        int right = letters.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1; // Cannot be mid
            } else {
                right = mid; // Can be mid
            }
        }
        return letters[left % letters.length]; // To deal with not found;
    }
}
