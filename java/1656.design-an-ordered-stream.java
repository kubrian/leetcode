import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    int head;
    String[] data;

    public OrderedStream(int n) {
        head = 0;
        data = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        data[idKey - 1] = value;
        List<String> res = new ArrayList<>();
        while (head < data.length && data[head] != null) {
            res.add(data[head]);
            head++;
        }
        return res;
    }
}
