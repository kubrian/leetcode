import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        class Row implements Comparable<Row> {
            int idx;
            int soldiers;

            Row(int idx) {
                this.idx = idx;
                this.soldiers = Arrays.stream(mat[idx]).sum();
            }

            public int compareTo(Row o) {
                int cmp = Integer.compare(this.soldiers, o.soldiers);
                return cmp != 0 ? cmp : Integer.compare(this.idx, o.idx);
            }
        }

        List<Row> rows = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            rows.add(new Row(i));
        }
        Collections.sort(rows);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = rows.get(i).idx;
        }
        return res;
    }
}
