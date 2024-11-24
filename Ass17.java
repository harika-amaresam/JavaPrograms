package Assignments;
class One1
{
	One1()
	{
		System.out.println("im one");
	}
	
}
class Two1 extends One1
{
	Two1()
	{
		System.out.println("im two");
	}
	
}
class Three1 extends Two1
{
	Three1()
	{
		super();
		System.out.println("im three");
	}
}

public class Ass17 {

	public static void main(String[] args) {
		new Three1();
		// TODO Auto-generated method stub

	}

}
