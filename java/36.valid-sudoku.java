import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            List<Character> row = new ArrayList<>();
            List<Character> col = new ArrayList<>();
            List<Character> box = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                row.add(board[i][j]);
                col.add(board[j][i]);
                box.add(board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3]);
            }

            if (!distinct(row) || !distinct(col) || !distinct(box)) {
                return false;
            }

        }
        return true;

    }

    public boolean distinct(List<Character> list) {
        list = list.stream().filter(x -> x != '.').collect(Collectors.toList());
        return list.size() == new HashSet<>(list).size();
    }
}
