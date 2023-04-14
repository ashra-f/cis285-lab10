package lab10;

public class SelectionSort {
	private int temp;
	
	/** Creates a new instance of SelectionSort */
	public SelectionSort() {}
	
	/* A simple SelectionSort algorithm
	* pre-condition: unsorted array of integers
	* post-condition: sorted array of integers
	* inputs: array of integers
	* outputs: sorted array of integers
	* special conditions: none
	*/
	public int[] basicSelectionSort(int[] x) {
		for (int i = 0; i < x.length; ++i) {
			int minIndex = i;
			for (int j= i+1; j < x.length; ++j) {
				if (x[minIndex] > x[j]) {
					minIndex = j;
				}
			} // end of inner for loop
			setTemp(x[i]);
			x[i] = x[minIndex];
			x[minIndex] = getTemp();
		} // end of outer for loop
		return x;
	} // end of basicSelectionSort method

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
}