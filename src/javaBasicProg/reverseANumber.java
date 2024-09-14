package javaBasicProg;

import java.util.Scanner;

public class reverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		/*int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10; // 0*10 + 1234%10= 0 +4
			num = num / 10; // 1234/10 = 123
		}*/
		
		//Using StringBuffer class , reverse method
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();*/
		
		//Using StringBuilder class and reverse method
		
		StringBuilder sb = new StringBuilder();
		StringBuilder rev = sb.append(num);
				
		System.out.println("Reverse Number is " + rev);

	}

}
