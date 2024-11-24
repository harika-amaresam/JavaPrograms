package Assignments;
class Assoverride1
{
	void test()
	{
		System.out.println("im parent");
	}
}
public class Ass21 extends Assoverride1 
{
	void test()
	{
		super.test();
		System.out.println("im child");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Ass21 a=new Ass21();
		a.test();
	}

}
