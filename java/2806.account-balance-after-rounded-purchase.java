class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (int) Math.round((double) purchaseAmount / 10) * 10;      
    }
}
