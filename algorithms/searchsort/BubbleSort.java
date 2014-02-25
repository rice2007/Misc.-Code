package algorithms.searchsort;

import java.util.ArrayList; 

@SuppressWarnings("serial")
public class BubbleSort<T> extends ArrayList<T> implements Comparable<T>{
	
	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>> void sort() {
		int n = this.size();
		boolean swapped = false;

        	do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (((T) this.get(i-1)).compareTo((T) this.get(i)) == 1) {
					this.add(i-1, this.get(i));
					this.remove(i+1);
					swapped = true;
				}
			}
			n -= 1;
		} while (swapped);
	}

	@Override
	public int compareTo(T that) {
		return this.compareTo(that);
	}
	
	public static void main(String[] args) {
		BubbleSort<Integer> intList = new BubbleSort<>();
		for (int i = 0; i < 1000; i++) {
			intList.add((int) (Math.random() * 1001));
		}
		System.out.println(intList);

		intList.sort();
		System.out.println(intList);
	}
	
}
