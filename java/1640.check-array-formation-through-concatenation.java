import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        int index = 0;
        while (index < arr.length) {
            int[] piece = map.get(arr[index]);
            if (piece == null) {
                return false;
            }
            for (int i = 0; i < piece.length; i++) {
                if (arr[index] != piece[i]) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
