class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int dist = 0;
        while (dist < words.length / 2 + 1) {
            int left = (startIndex - dist + words.length) % words.length;
            int right = (startIndex + dist) % words.length;
            if (words[left].equals(target) || words[right].equals(target)) {
                return dist;
            }
            dist++;
        }
        return -1;
    }
}
