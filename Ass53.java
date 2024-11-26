package Assignments;


	
	interface Asuper4
	{
		abstract void a1();
		abstract void a2();
	}
	abstract class A32
	{
		void a3()
		{
			System.out.println("im super class method 3");
			
		}
		void a4()
		{
			System.out.println("im super class method 4");
			
		}
		abstract void a5();
		abstract void a6();
		
	}

	public class Ass53 extends A32 implements Asuper4
	{
		public void a1()
		{
			System.out.println("im sub  class method 1");
			
		}
		public void a2()
		{
			System.out.println("im sub  class method 2");
			
		}
		void a5()
		{
			System.out.println("im super class method 1");
			
		}
		void a6()
		{
			System.out.println("im super class method 2");
			
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Ass53 a=new Ass53();
			a.a1();
			a.a2();
			a.a3();
			a.a4();
			a.a5();
			a.a6();

		}

	}

