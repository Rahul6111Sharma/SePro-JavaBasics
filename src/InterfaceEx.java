interface Ina{
	void drive();
}

class car implements Ina
{
	public void drive()
	{
		System.out.println("Hello I am drive");
	}
	
}

public class InterfaceEx {

	public static void main(String[] args) {
		car c1 = new car();
		c1.drive();
	}

}
