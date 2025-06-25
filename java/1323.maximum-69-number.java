class Solution {
    public int maximum69Number(int num) {
        // Change first occurrence of 6 to 9
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }
}
