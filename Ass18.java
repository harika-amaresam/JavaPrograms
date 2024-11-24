package Assignments;
class One2
{
	One2()
	{
		System.out.println("im one");
	}
	
}
class Two2 extends One2
{
	Two2(int i)
	{
		System.out.println("im two");
	}
	
}
class Three2 extends Two2
{
	Three2()
	{
		super(1);
		System.out.println("im three");
	}
}
public class Ass18 {

	public static void main(String[] args) {
		new Three2();
		// TODO Auto-generated method stub

	}

}
