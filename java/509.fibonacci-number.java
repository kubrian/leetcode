class Solution {
    public int fib(int n) {
        int curr = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int larger = curr + next;
            curr = next;
            next = larger;
        }
        return curr;
    }
}
