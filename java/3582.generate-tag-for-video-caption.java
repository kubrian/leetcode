class Solution {
    public String generateTag(String caption) {
        String[] words = caption.trim().split(" ");
        StringBuilder sb = new StringBuilder("#");
        if (words.length == 0) {
            return "#";
        }
        sb.append(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() == 0) {
                continue;
            }
            sb.append(words[i].substring(0, 1).toUpperCase());
            sb.append(words[i].substring(1).toLowerCase());
        }
        return sb.substring(0, Math.min(sb.length(), 100)).toString();
    }
}
