package lab10;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public TestSelectionSort() {}
	
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] sortedArr = new int[5];
		sortedArr[0] = 2;
		sortedArr[1] = 7;
		sortedArr[2] = 8;
		sortedArr[3] = 9;
		sortedArr[4] = 10;
		
		SelectionSort ss = new SelectionSort();
		
	    int[] resultArr = ss.basicSelectionSort(arr);
	    		
		/** add tests to check for this unit test **/
	    assertArrayEquals(sortedArr, resultArr);
	}
	
	public void testNegative() {
	    int[] arr = new int[5];
	    arr[0] = -8;
	    arr[1] = -9;
	    arr[2] = -7;
	    arr[3] = -10;
	    arr[4] = -2;
	    int[] sortedArr = new int[5];
	    sortedArr[0] = -10;
	    sortedArr[1] = -9;
	    sortedArr[2] = -8;
	    sortedArr[3] = -7;
	    sortedArr[4] = -2;

	    SelectionSort ss = new SelectionSort();

	    int[] resultArr = ss.basicSelectionSort(arr);

	    /** Test data contains negative values only **/
	    assertArrayEquals(sortedArr, resultArr);
	}

	public void testMixed() {
	    int[] arr = new int[7];
	    arr[0] = 8;
	    arr[1] = -3;
	    arr[2] = 0;
	    arr[3] = -9;
	    arr[4] = 4;
	    arr[5] = 12;
	    arr[6] = 7;
	    int[] sortedArr = new int[7];
	    sortedArr[0] = -9;
	    sortedArr[1] = -3;
	    sortedArr[2] = 0;
	    sortedArr[3] = 4;
	    sortedArr[4] = 7;
	    sortedArr[5] = 8;
	    sortedArr[6] = 12;

	    SelectionSort ss = new SelectionSort();

	    int[] resultArr = ss.basicSelectionSort(arr);

	    /** Test data contains mixed numbers **/
	    assertArrayEquals(sortedArr, resultArr);
	}

	public void testDuplicates() {
	    int[] arr = new int[6];
	    arr[0] = 4;
	    arr[1] = 3;
	    arr[2] = 2;
	    arr[3] = 4;
	    arr[4] = 1;
	    arr[5] = 2;
	    int[] sortedArr = new int[6];
	    sortedArr[0] = 1;
	    sortedArr[1] = 2;
	    sortedArr[2] = 2;
	    sortedArr[3] = 3;
	    sortedArr[4] = 4;
	    sortedArr[5] = 4;

	    SelectionSort ss = new SelectionSort();

	    int[] resultArr = ss.basicSelectionSort(arr);

	    /** Test data contains duplicates **/
	    assertArrayEquals(sortedArr, resultArr);
	    
	}
}