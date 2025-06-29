class Solution {
    public int distMoney(int money, int children) {
        // Give everyone 1
        money -= children;
        if (money < 0)
            return -1;
        // Perfectly divisible
        if (money / 7 == children && money % 7 == 0)
            return children;
        // Left 4
        if (money / 7 == children - 1 && money % 7 == 3)
            return children - 2;
        // Too much money, give all to one
        return Math.min(children - 1, money / 7);
    }
}
