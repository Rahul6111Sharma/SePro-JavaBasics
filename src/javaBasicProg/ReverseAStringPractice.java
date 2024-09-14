package javaBasicProg;

import java.util.Scanner;

public class ReverseAStringPractice {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter your string"); Scanner sc = new Scanner(System.in);
		 * String word = sc.nextLine();
		 * 
		 * // String s = "Java Is Javaa"; StringBuilder sb = new StringBuilder(word);
		 * StringBuilder reversestr = sb.reverse();
		 * System.out.println("Revrse String : " + reversestr +" ");
		 */
		
		System.out.println("Enter your string"); Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		StringBuffer sb = new StringBuffer(word);
		StringBuffer reversestr = sb.reverse();
		System.out.println("Revrse String : " + reversestr +" ");
	}

}
