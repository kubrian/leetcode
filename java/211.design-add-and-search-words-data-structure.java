class WordDictionary {

    private WordDictionary[] children;
    private char val;
    private boolean isEnd;

    public WordDictionary() {
        children = new WordDictionary[26];
        isEnd = false;
        val = ' ';
    }

    public void addWord(String word) {
        WordDictionary curr = this;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new WordDictionary();
            }
            curr.children[idx].val = c;
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        WordDictionary curr = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (WordDictionary child : curr.children) {
                    if (child != null && child.search(word.substring(i + 1))) {
                        return true;
                    }
                }
                return false;
            } else {
                int idx = c - 'a';
                if (curr.children[idx] == null) {
                    return false;
                }
                curr = curr.children[idx];
            }
        }
        return curr.isEnd;
    }
}
