package javaBasicProg;

import java.util.Scanner;

public class CountTheWordinaString {

	public static void main(String[] args) {
		System.out.println("Enter the String  :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
				count++;
			}
		}
		System.out.println("Count is :"+count);
	}

}
