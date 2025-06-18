class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int children = 1;
        for (int i = 0; i < nodes.length; i++) {
            children--;
            if (children < 0) {
                return false;
            }
            if (!nodes[i].equals("#")) {
                children += 2;
            }
        }
        return children == 0;
    }
}
