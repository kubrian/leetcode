class Solution {
    public boolean canBeEqual(String s1, String s2) {
        // Generate all four permutations of s1
        char[] chars = s1.toCharArray();
        String s11 = s1;

        swap(chars, 0, 2);
        String s12 = new String(chars);

        swap(chars, 1, 3);
        String s13 = new String(chars);

        swap(chars, 0, 2);
        String s14 = new String(chars);

        return s2.equals(s11) || s2.equals(s12) || s2.equals(s13) || s2.equals(s14);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
