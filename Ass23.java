package Assignments;
class Asuper
{
	void a1()
	{
		System.out.println("im super class method 1");
		
	}
	void a2()
	{
		System.out.println("im super class method 2");
		
	}
}
abstract class A11 extends Asuper
{
	void a3()
	{
		System.out.println("im abstract class method 1");
		
	}
	void a4()
	{
		System.out.println("im abstract class method 2");
		
	}
	abstract void a5();
	abstract void a6();
	
}
public class Ass23 extends A11{
	void a5()
	{
		System.out.println("im sub  class method 1");
		
	}
	void a6()
	{
		System.out.println("im sub  class method 2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ass23 a=new Ass23();
a.a1();
a.a2();
a.a3();
a.a4();
a.a5();
a.a6();
	}

}
