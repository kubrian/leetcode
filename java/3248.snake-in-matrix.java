import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0;
        int col = 0;
        for (String command : commands) {
            if (command.equals("UP")) {
                row = Math.max(0, row - 1);
            } else if (command.equals("DOWN")) {
                row = Math.min(n - 1, row + 1);
            } else if (command.equals("LEFT")) {
                col = Math.max(0, col - 1);
            } else if (command.equals("RIGHT")) {
                col = Math.min(n - 1, col + 1);
            }
        }
        return row * n + col;
    }
}
