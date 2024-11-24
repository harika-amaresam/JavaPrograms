package Assignments;
interface I1
{
	void a1();
	
}
interface I2
{
	void a2();
	
}
public class Ass24 implements I1,I2
{
    public void a1()
    {
    	
    	System.out.println("inerface 1");
    }
    public void a2()
    {
    	
    	System.out.println("inerface 2");
    }
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		Ass24 a=new Ass24();
		a.a1();
		a.a2();
	}

}
