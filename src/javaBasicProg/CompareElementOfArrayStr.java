package javaBasicProg;

import java.util.HashSet;

//Find the duplicate element in Array

public class CompareElementOfArrayStr {

	public static void main(String[] args) {
		String arr[] = { "A", "B", "C", "D", "D" };
	/*	String arr[] = { "A", "B", "C", "D", "D" };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Match Found :" + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}*/
		
		
		//Approach 2 HashSet
		//HashSet is a collection in java which stores the unique value 
		
		HashSet <String> lang = new HashSet();
		
		boolean flag= false;
		for(String l:arr) {
			if (lang.add(l)==false)
			{
				System.out.println("Match Found :" +l);
				flag = true;
			}
		}
	if (flag == false) {
		System.out.println("Element not found");
	}
	
	}
}
