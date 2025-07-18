class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                words[i] = words[i].substring(0, 1).toUpperCase()
                        + words[i].substring(1).toLowerCase();
            } else {
                words[i] = words[i].toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}
