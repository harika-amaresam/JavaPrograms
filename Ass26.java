package Assignments;

public class Ass26 {

	public static void main(String[] args) 
	{
		String str="malayalam", rstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		if(str.equals(rstr))
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
		// TODO Auto-generated method stub

	}

}