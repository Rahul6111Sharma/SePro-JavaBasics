package javaBasicProg;

public class fibonacciSeries {

	public static void main(String[] args) {
	
		//0, 1, 2, 3, 5, 8, 13...... Series
		
		int n1=0, n2=1;
		System.out.print(n1 + " " +n2+ " ");
		for(int i=2;i<10;i++)
		{
			int sum = n1+n2; //0 + 1 
			System.out.print(sum+ " ");
			n1=n2;
			n2=sum;

		}

	}

}
