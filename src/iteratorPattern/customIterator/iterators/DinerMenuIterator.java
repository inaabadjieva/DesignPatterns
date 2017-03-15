package iteratorPattern.customIterator.iterators;

import iteratorPattern.customIterator.menus.MenuItem;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public Object next() {
		MenuItem menuItem = this.items[this.position];
		this.position = this.position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (this.position >= this.items.length || this.items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
