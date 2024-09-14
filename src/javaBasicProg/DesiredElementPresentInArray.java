package javaBasicProg;

public class DesiredElementPresentInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,50,55,60};
		int search_elm = 20;
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_elm)
			{
				System.out.println("Element present : "+arr[i]);
				flag = true;
			}
		}
		if (flag==false)
		{
			System.out.println("Element not found");
		}

	}

}
