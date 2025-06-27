class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }
        String[] words = text.trim().split("\\s+");
        int gaps = words.length - 1;
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < spaces / gaps; j++) {
                sb.append(' ');
            }
            sb.append(words[i]);
        }
        return sb.append(" ".repeat(text.length() - sb.length())).toString();
    }
}
