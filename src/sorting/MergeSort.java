/**
* Java Implementation of Merge sort	
*
**/
package sorting;

import java.util.Arrays;

public class MergeSort {
	
	/**
	* Sorts an array using merge sort algorithm	
	*/
	public int[] mergeSort(int[] arr){
		int len = arr.length;
		if(len > 1){
			// break in 2
			int mid = len / 2;
			int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
			int [] right = mergeSort(Arrays.copyOfRange(arr, mid, len));
			// Merge left and right
			return merge(left, right);
		}
		return arr;
	}
	
	private int[] merge(int[] left, int[] right){
		int totalLength = left.length + right.length;
		int[] mergedArr = new int[totalLength];
		int count = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		while(count < totalLength){
			// Compare left and right elements
			if(leftIndex >= left.length){
				// Add right part to new array
				mergedArr[count] = right[rightIndex];
				rightIndex++;
			} else if(rightIndex >= right.length){
				// Add left to new array
				mergedArr[count] = left[leftIndex];
				leftIndex++;
			} else if(left[leftIndex] < right[rightIndex]){
				// Add left to new array
				mergedArr[count] = left[leftIndex];
				// Increase left counter
				leftIndex++;
			} else {
				// Add right to new array
				mergedArr[count] = right[rightIndex];
				// Increase left counter
				rightIndex++;
			}
			// Increment counter
			count ++;
		}
		return mergedArr;
	}
	
}