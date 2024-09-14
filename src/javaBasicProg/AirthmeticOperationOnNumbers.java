package javaBasicProg;

import java.util.Scanner;

public class AirthmeticOperationOnNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int Num2 = sc.nextInt();
		int resultadd = Num1+Num2;
		int resultSub = Num1-Num2;
		int resultMul = Num1*Num2;
		int resultDiv = Num1/Num2;
		System.out.println("Add of two numbere is : " + resultadd);
		System.out.println("Sub of two numbere is : " + resultSub);
		System.out.println("Mul of two numbere is : " + resultMul);
		System.out.println("Div of two numbere is : " + resultDiv);
}

}
