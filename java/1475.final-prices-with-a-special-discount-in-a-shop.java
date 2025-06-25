import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        // Go from right to left
        // Suppose some very cheap product is found, it will probably not have a discount
        // But every product on the left can use this for discount, and will use this over whatever to the right of this.
        // Hence a stack
        int[] res = new int[prices.length];
        Stack<Integer> cheapStuff = new Stack<>();
        for (int i = prices.length - 1; i >= 0; i--) {
            while (!cheapStuff.isEmpty() && cheapStuff.peek() > prices[i]) {
                cheapStuff.pop();
            }
            res[i] = cheapStuff.isEmpty() ? prices[i] : prices[i] - cheapStuff.peek();
            cheapStuff.push(prices[i]);
        }        
        return res;
    }
}
