import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class NestedIterator implements Iterator<Integer> {

    Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> list = new ArrayList<>();
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else {
                NestedIterator nestedIterator = new NestedIterator(nestedInteger.getList());
                while (nestedIterator.hasNext()) {
                    list.add(nestedIterator.next());
                }
            }
        }
        it = list.iterator();
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }
}