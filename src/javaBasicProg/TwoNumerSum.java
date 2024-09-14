package javaBasicProg;

import java.util.Scanner;

public class TwoNumerSum {

	public static void main(String[] args) {
		System.out.println("Enter First number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		Scanner sc1 = new Scanner(System.in);
		int num2 = sc1.nextInt();
		int result = num1 * num2;
		System.out.println("Mul of two numbere is : " + result);

	}

}
