class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        String year = Integer.toBinaryString(Integer.parseInt(parts[0]));
        String month = Integer.toBinaryString(Integer.parseInt(parts[1]));
        String day = Integer.toBinaryString(Integer.parseInt(parts[2]));
        return year + "-" + month + "-" + day;
    }
}
