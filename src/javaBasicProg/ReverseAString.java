package javaBasicProg;

public class ReverseAString {

	public static void main(String[] args) {
		
		
		String s = "Java Is Javaa";
		String[] word = s.split("\\s");
		String reverse = "";
		
		for(String wo : word)
		{
			StringBuffer sb = new StringBuffer(wo);
			sb.reverse();
			reverse = reverse + sb.toString()+" ";
		}
		System.out.println("Reversed string is :"+ reverse);
	}

}
