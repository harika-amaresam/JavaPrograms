package Assignments;

import java.util.Arrays;

public class Ass37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr1 = "Heart";
	      String inputStr2 = "heart";
	      System.out.println("The given strings are: " + inputStr1 +" and " + inputStr2);
	      inputStr1 = inputStr1.toLowerCase();
	      inputStr2 = inputStr2.toLowerCase();
	      if(inputStr1.length() == inputStr2.length()) 
	      {
	    	  if(inputStr1.equals(inputStr2)) 
		         {
		            System.out.println("Both strings are equal");
		         } 
	    	  else
		         {
		            System.out.println("Both strings are not equal.");
		         }
	      }
	}

}
