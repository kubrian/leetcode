class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int s1 = score(player1);
        int s2 = score(player2);
        return s1 > s2 ? 1 : s1 < s2 ? 2 : 0;
    }

    private int score(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i - 1 >= 0 && arr[i - 1] == 10 || i - 2 >= 0 && arr[i - 2] == 10) {
                sum += arr[i] * 2;
            } else {
                sum += arr[i];
            }
        }
        return sum;
    }
}
