import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values,
            List<List<String>> queries) {
        // Graph where E(a, b) == a / b
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            // computeIfAbsent is like .putIfAbsent + .get
            graph.computeIfAbsent(a, k -> new HashMap<>()).put(b, values[i]);
            graph.computeIfAbsent(b, k -> new HashMap<>()).put(a, 1.0 / values[i]);
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);
            if (!graph.containsKey(a) || !graph.containsKey(b)) {
                res[i] = -1.0;
            } else {
                res[i] = dfs(graph, a, b, new HashSet<>());
            }
        }
        return res;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String a, String b, Set<String> visited) {
        if (!graph.containsKey(a) || !graph.containsKey(b)) {
            return -1.0;
        }
        if (a.equals(b)) {
            return 1.0;
        }
        visited.add(a);
        for (String neighbor : graph.get(a).keySet()) {
            if (visited.contains(neighbor)) {
                continue;
            }
            double res = dfs(graph, neighbor, b, visited);
            if (res != -1.0) {
                return res * graph.get(a).get(neighbor);
            }
        }
        return -1.0;
    }
}
