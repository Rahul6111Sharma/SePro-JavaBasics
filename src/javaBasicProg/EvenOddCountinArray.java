package javaBasicProg;

public class EvenOddCountinArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3,4,6};
		int count_even = 0;
		int count_odd = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even Number " + a[i]);
				count_even++;
			} else {
				System.out.println("Odd Number " + a[i]);
				count_odd++;
			}
		}
		System.out.println("Total even count is "+ count_even);
		System.out.println("Total odd count is "+ count_odd);
	}
}
