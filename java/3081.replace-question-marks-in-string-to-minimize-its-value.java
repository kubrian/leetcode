import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String minimizeStringValue(String s) {
        class CharCost implements Comparable<CharCost> {
            char ch;
            int occur;

            CharCost(char c, int o) {
                ch = c;
                occur = o;
            }

            public int compareTo(CharCost o) {
                int diff = Integer.compare(occur, o.occur);
                return diff != 0 ? diff : Character.compare(ch, o.ch);
            };

        }
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<CharCost> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }

        int numFucks = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != '?') {
                map.put(curr, map.get(curr) + 1);
            } else {
                numFucks++;
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            pq.offer(new CharCost(e.getKey(), e.getValue()));
        }

        StringBuilder inter = new StringBuilder();
        for (int i = 0; i < numFucks; i++) {
            CharCost c = pq.poll();
            inter.append(c.ch);
            c.occur++;
            pq.offer(c);
        }
        char[] toUse = inter.toString().toCharArray();
        Arrays.sort(toUse);
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != '?') {
                sb.append(curr);
            } else {
                sb.append(toUse[j++]);
            }
        }
        return sb.toString();
    }
}
