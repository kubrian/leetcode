import java.util.Random;

class Solution {

    ListNode head;
    Random rand = new Random();

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int result = head.val;
        ListNode curr = head.next;
        int count = 2;
        while (curr != null) {
            if (rand.nextInt(count++) == 0) {
                result = curr.val;
            }
            curr = curr.next;
        }
        return result;
    }
}
