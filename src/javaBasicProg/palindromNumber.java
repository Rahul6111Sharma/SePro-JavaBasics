package javaBasicProg;

import java.util.Scanner;

public class palindromNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String st = sc.next();
//		String orgSt = st;
//
//		StringBuffer sb = new StringBuffer(st);
//		sb.reverse();
//		String rev = sb.toString();
//		if (orgSt.equals(rev)) {
//			System.out.println(orgSt + "Is a Palindrome String");
//		} else {
//			System.out.println(orgSt + "Is a not Palindrome String");
//		}
		
		System.out.println("Enter your Number");
		 int num = sc.nextInt();
		int orgNum = num;
		StringBuffer sb = new StringBuffer();	
		sb.reverse();
		String rev = sb.toString();
		int intrev = Integer.parseInt(rev);  
				
		if(num==intrev)
		{
			System.out.println(+orgNum+ "Is a Palindrome number");
		}
		else
		{
			System.out.println("Number is not Palindorme");
		}
	}

}
