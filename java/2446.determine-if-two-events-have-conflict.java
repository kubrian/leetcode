class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int s1 = parseTime(event1[0]);
        int e1 = parseTime(event1[1]);
        int s2 = parseTime(event2[0]);
        int e2 = parseTime(event2[1]);
        
        return !(e1 < s2 || e2 < s1);
    }

    private int parseTime(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
