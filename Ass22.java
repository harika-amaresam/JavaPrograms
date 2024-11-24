package Assignments;
abstract class A1
{
	abstract void display();
	void test()
	{
		System.out.println("im abstract class");
	}
}
class B1 extends A1
{
	void display()
	{
		System.out.println("im child class");
	}
}
public class Ass22 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		B1 b=new B1();
		b.display();
		b.display();
		b.test();
	}

}
