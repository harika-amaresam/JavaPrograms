package Assignments;

class Aa
{
	public void display1() 
    { 
        System.out.println("1"); 
    } 
	private void display2() 
    { 
        System.out.println("2"); 
    } 
	 
	protected void display3() 
	    { 
	        System.out.println("3"); 
	    } 
	
	
	void display4() 
	    { 
	        System.out.println("4"); 
	    } 
}

public class Ass55 extends Aa {

	public static void main(String[] args)
	{
		
Ass55 a=new Ass55();
a.display1();
//a.display2();
a.display3();
a.display4();

	}

}
