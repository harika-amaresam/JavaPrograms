package Assignments;

public class Ass44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr1 = "kv no 2";
		char ch;
		boolean b;
		int j=0;
		for (int i=0;i<inputStr1.length();i++)
		{
			ch=inputStr1.charAt(i);	
			if(b=Character.isSpaceChar(ch))
			{
				j=j+1;
			}
		}
		 
		System.out.println(inputStr1.length()-j);
		
	}

}
