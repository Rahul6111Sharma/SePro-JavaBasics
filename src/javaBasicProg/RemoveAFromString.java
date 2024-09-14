package javaBasicProg;

public class RemoveAFromString {

	public static void main(String[] args) {
		String s = "Java is very A and A in B and B";
		int beforeReplace = s.length();
		int afterReplace = s.replace("a", "").length();
		s = s.replace("a", "");
		int count = beforeReplace-afterReplace;
		System.out.println("The remaing count is :"+count);
		System.out.println("Remaing string:"+s);
	}
}
