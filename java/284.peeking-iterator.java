import java.util.Iterator;
import java.util.Optional;

class PeekingIterator implements Iterator<Integer> {
	
	private Iterator<Integer> iterator;
	private Optional<Integer> next = Optional.empty();
	
	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		this.iterator = iterator;
		next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return next.orElse(null);
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Optional<Integer> current = next;
		if (iterator.hasNext()) {
			next = Optional.of(iterator.next());
		} else {
			next = Optional.empty();
		}
		return current.orElse(null);
	}

	@Override
	public boolean hasNext() {
		return next.isPresent();
	}
}
