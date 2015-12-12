/**
* Tests for Merge sort algorithm
**/
package sorting;

import org.junit.Test;

public class MergeSortTest {
	
	@Test
	public void testMergeSort(){
		System.out.println("Inside test testMergeSort");
		final MergeSort ms = new MergeSort();
		// Create array to sort
		int[] unsortedArr = new int[]{6,5,3,1,8,7,2,4,4};
		int[] sortedArr = ms.mergeSort(unsortedArr);
		System.out.println("Printing sorted arr");
		for(int element: sortedArr){
			System.out.println(element);
		}
	}
	@Test
	public void testMergeSortEmpty(){
		System.out.println("Inside test testMergeSortEmpty");
		final MergeSort ms = new MergeSort();
		// Create array to sort
		int[] unsortedArr = new int[]{};
		int[] sortedArr = ms.mergeSort(unsortedArr);
		System.out.println("Printing sorted arr");
		for(int element: sortedArr){
			System.out.println(element);
		}
	}
	
	@Test
	public void testMergeSortOne(){
		System.out.println("Inside test testMergeSortOne");
		final MergeSort ms = new MergeSort();
		// Create array to sort
		int[] unsortedArr = new int[]{2};
		int[] sortedArr = ms.mergeSort(unsortedArr);
		System.out.println("Printing sorted arr");
		for(int element: sortedArr){
			System.out.println(element);
		}
	}
	
}