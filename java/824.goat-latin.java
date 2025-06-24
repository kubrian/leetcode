class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            if (isVowel(curr.charAt(0))) {
                sb.append(curr);
            } else {
                sb.append(curr.substring(1)).append(curr.charAt(0));
            }
            sb.append("ma");
            sb.append("a".repeat(i + 1));
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
