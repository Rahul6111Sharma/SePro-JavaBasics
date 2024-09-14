package javaBasicProg;

public class RemoveJunkFromaString {

	public static void main(String[] args) {

		String s = "!@#$%^&*(*&^%$#@#$%^&*(*&^%$# My String 5412050510510 515 0";
		// replaceAll is a method which replace the things
		s = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println("The String is :" + s);
		
		
		
		
		// Replace the extra space with the
		String s1 = "My       Na Me is            Java         JavaaZ";
		
		//			\\s denotes with space
		
		s1 = s1.replaceAll("\\s ", "");
		System.out.println("The String without the space :" + s1);
		
	}

}
