package javaBasicProg;

import java.util.Scanner;

public class SwapTwoNumberPractice {

	public static void main(String[] args)
	{
		
		System.out.println("Enter Two Number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		int buf = 0;
		buf = num1;
		num1 = num2;
		num2 = buf;
		System.out.println("Swaped Number is : "+num1  +num2 );
		
				
	}
}
