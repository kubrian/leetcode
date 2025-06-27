class Solution {
    public String interpret(String command) {
        // Note that it works because "o" is not in "(al)" -- commutative...
        return command.replace("()", "o").replace("(al)", "al");
    }
}
