import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0].replace(".", "");
            int idx = local.indexOf("+");
            if (idx != -1) {
                local = local.substring(0, idx);
            }
            String domain = parts[1];
            set.add(local + "@" + domain);
        }
        return set.size();
    }
}
