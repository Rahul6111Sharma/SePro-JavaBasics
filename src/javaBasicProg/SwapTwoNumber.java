package javaBasicProg;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("Before Swap " +a    +b);
		
		int t = b; //t = 5
		b = a; // b = 10
		a = t;  // a = 5
		System.out.println("After Swap" +a   +b);
	}

}
