import java.util.Arrays;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int numOnes = Arrays.stream(students).sum();
        int numZeroes = students.length - numOnes;
        for (int x: sandwiches) {
            if (x == 0) {
                // no more students that want 0, so all remaining 1s cannot take
                if (numZeroes == 0) {
                    return numOnes;
                }
                numZeroes--;
            } else {
                // no more students that want 1, so all remaining 0s cannot take
                if (numOnes == 0) {
                    return numZeroes;
                }
                numOnes--;
            }
        }
        return 0;
    }
}
