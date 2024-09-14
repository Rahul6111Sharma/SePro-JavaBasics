package javaBasicProg;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		//int arr[] = {10,90, 80, 20,30,50,55,60};
		
		/*System.out.println("Before sorting.. :"+Arrays.toString(arr));
		//Approach 1
		Arrays.parallelSort(arr);
		//ParallelSort is a method in Arrays class which sort the array
		System.out.println("After sorting.. :"+Arrays.toString(arr));*/
		
		//Approach 2
		/*System.out.println("Before sorting.. :"+Arrays.toString(arr));
		//Approach 1
		Arrays.sort(arr);
		//sort is also a method in Arrays class which sort the array
		System.out.println("After sorting.. :"+Arrays.toString(arr));*/
		
		//Approach 3
		//Sorting in reverse order Desending
		Integer arr[] = {10,90, 80, 20,30,50,55,60};
		System.out.println("Before sorting.. :"+Arrays.toString(arr));
		//Approach 1
		Arrays.sort(arr,Collections.reverseOrder());
		//sort is also a method in Arrays class which sort the array
		System.out.println("After sorting Desending order .. :"+Arrays.toString(arr));
	}

}
