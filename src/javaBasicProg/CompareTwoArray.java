package javaBasicProg;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 6 };
		int a2[] = { 1, 2, 3, 4, 6 };
		// int a2[] = { 1, 22, 3, 4, 5, 8, 71 };

		// Approach 1 with the help of equals method
		/*
		 * boolean status = Arrays.equals(a, a2); if (status == true) {
		 * System.out.println("Arrays are equal"); } else {
		 * System.out.println("Arrays are not equal"); }
		 */

		// Approach 2
		boolean status = true;

		if (a.length == a2.length) {
			for (int i = 0; i< a.length; i++) {
				if (a[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}
}