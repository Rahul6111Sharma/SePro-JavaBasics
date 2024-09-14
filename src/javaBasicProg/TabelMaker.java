package javaBasicProg;

import java.util.Scanner;

public class TabelMaker {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		for(int i = 1; i<=10; i++)
		{
			int result = Num*i;
			System.out.println(result);
		}
	}

}
