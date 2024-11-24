package Assignments;
class Assoverride
{
	void test()
	{
		System.out.println("im parent");
	}
}
public class Ass20 extends Assoverride  {
	void test()
	{
		System.out.println("im child");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Ass20 a=new Ass20();
		a.test();

	}

}
