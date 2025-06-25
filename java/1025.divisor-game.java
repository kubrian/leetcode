class Solution {
    public boolean divisorGame(int n) {
        // Ridiculous. 1 loses
        // Even can turn into odd (pick 1) or even (pick 2)
        // Odd -> even number since odd % even != 0, so odd - odd = even
        // So even -(choose)-> odd -(forced) -> even -> ...
        return n % 2 == 0;
    }
}
