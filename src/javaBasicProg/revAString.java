package javaBasicProg;

public class revAString {

	public static void main(String[] args) {
		
		String str = "ABDE";
		String rev = "";
		
		// 1. Using Character array
		
//		char a[] = str.toCharArray();
//		int len = a.length;
//		for(int i=len-1;i>=0;i--)
//		{
//			rev = rev+a[i];
//		}
//			System.out.println("Reverse is :" +rev);
		
		//Using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}

}
