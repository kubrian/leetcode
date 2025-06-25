import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        class Pos {
            int x, y;

            Pos(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof Pos)) {
                    return false;
                }
                Pos pos = (Pos) o;
                return x == pos.x && y == pos.y;
            }

            @Override
            public int hashCode() {
                return x * 31 + y;
            }
        }
        int x = 0, y = 0;
        Set<Pos> set = new HashSet<>();
        set.add(new Pos(x, y));
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }
            if (set.contains(new Pos(x, y))) {
                return true;
            }
            set.add(new Pos(x, y));
        }
        return false;
    }
}
