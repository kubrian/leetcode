import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        class Person implements Comparable<Person> {
            int height;
            String name;

            Person(int idx) {
                height = heights[idx];
                name = names[idx];
            }

            @Override
            public int compareTo(Person o) {
                return Integer.compare(o.height, height);
            }
        }

        Queue<Person> queue = new PriorityQueue<>();
        for (int i = 0; i < names.length; i++) {
            queue.add(new Person(i));
        }

        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            res[i] = queue.poll().name;
        }
        return res;
    }
}
