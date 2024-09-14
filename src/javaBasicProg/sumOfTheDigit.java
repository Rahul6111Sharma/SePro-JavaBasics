package javaBasicProg;

public class sumOfTheDigit {

	public static void main(String[] args) {
		int num = 134;
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+num%10;  //0+4
			num = num/10; //123
			
		}
		System.out.println("Sum of the digit is :" +sum);
	}

}
