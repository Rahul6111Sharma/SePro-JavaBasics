package javaBasicProg;
import java.util.Random;

public class RandomNumberString {

	public static void main(String[] args) {
		
		//Approach 1
		Random ran = new Random();
		/*
		 * int ran_int = ran.nextInt(100);
		 * System.out.println("Random Number is "+ran_int);
		 */
		
		
		//String
		String ran_string = ran.toString();
		System.out.println("Random string is "+ran_string);
	}
}
