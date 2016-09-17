package sorting;

import java.util.*;

// Heap sort
public class HeapSort {
	
	public static void main(String[] args){
		// Unsorted array
		int[] arr = {3,2,6,8,1,9,13,15};
		HeapSort.sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	// Uses heapsort to sort the array
	private static void sort(int[] arr){
		if(arr.length == 0){
			return;
		}
		//heapify
		HeapSort.heapify(arr);
		
		for(int i = arr.length - 1; i > 0; i --){
			// Sift first with last
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = arr[temp];
			
			
			
			
		}
	}
	
	// Heapify the array
	private static void heapify(int[] arr){
		
	}
	
}