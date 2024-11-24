package Assignments;
class One
{
	void test1()
	{
		System.out.println("im one");
	}
	
}
class Two extends One
{
	void test2()
	{
		System.out.println("im two");
	}
	
}
class Three extends Two
{
	static void test3()
	{
		System.out.println("im three");
	}
}
public class Ass16 extends Three{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		test3();
		Ass16 a=new Ass16();
		a.test1();
		a.test2();
		

	}

}
