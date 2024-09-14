package javaBasicProg;

import java.util.Scanner;

public class largestAmoungAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dight a");
		int a = sc.nextInt();
		System.out.println("Enter dight b");
		int b = sc.nextInt();
		System.out.println("Enter dight c");
		int c = sc.nextInt();
		/*
		 * if (a > b && a > c) { System.out.println("a is largest : " + a); } else if (b
		 * > a && b > c) { System.out.println("b is largest : " + b); } else
		 * System.out.println("c is largest : " + c);
		 */
	
		//With the help of Ternary operator
		
		/*
		 * int largest1 = a>b?a:b; // agar a>b bada h to return karega a means ?
		 * condition true false int largest2 = c>largest1?c:largest1;
		 * System.out.println(largest2+" is the lastest number");
		 */
		
		//in only one line with one veriable
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+" is the lastest number");
		
		
	}

}
