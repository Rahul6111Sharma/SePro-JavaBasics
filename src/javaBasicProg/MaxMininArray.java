package javaBasicProg;

public class MaxMininArray {

	public static void main(String[] args) {
		int a[]= {1,0,3,44,5,8,99};
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max number is "+max);
		
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Min number is "+min);
	}

}
