package Assignments;

public class Ass25 {

	public static void main(String[] args) {
		String str="Harika", rstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println(rstr);
	}

}
