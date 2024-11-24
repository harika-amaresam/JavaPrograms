package Assignments;

public class Ass49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputStr1 = "RAM";
		char ch;
		for (int i=0;i<inputStr1.length();i++)
		{
			ch=inputStr1.charAt(i);
			System.out.println(ch);
			
		}
		for (int i=inputStr1.length()-1;i>=0;i--)
		{
			ch=inputStr1.charAt(i);
			System.out.println(ch);
			
		}
		//System.out.println();

	}

}
