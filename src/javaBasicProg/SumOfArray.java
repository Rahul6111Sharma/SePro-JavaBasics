package javaBasicProg;

public class SumOfArray {

	public static void main(String[] args) {
	
		int a[]= {1,5,3,6,43,3};
		int sum = 0;
		/*
		 * for(int i=0;i<=a.length-1;i++) { sum=sum+a[i]; }
		 */
		
		//ENhanced for loop OR FOr each loop
		for(int value:a)
		{
			sum = value + sum; 
		}
		System.out.println("Sum of array element is "+sum);
	}

}
