import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("Enter your Number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(num);
	sc.close();
	System.out.println("Enter the string value");
	String ss = sc.nextLine();
	System.out.println(ss);
	sc.close();
	}

}
