package iteratorPattern.customIterator.iterators;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList items;
	int position = 0;
 
	public PancakeHouseMenuIterator(ArrayList items) {
		this.items = items;
	}
 
	public Object next() {
		Object object = this.items.get(this.position);
		this.position = this.position + 1;
		return object;
	}
 
	public boolean hasNext() {
		if (this.position >= this.items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
