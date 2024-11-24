package Assignments;

import java.util.Scanner;

public class Ass34 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
	  
		n=sc.nextInt();   
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		 
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		for (int i=0; i<n; i++)
		{
			if(array[i]==50)
			{
				System.out.println("it contains 50");
			}
			
		}
		
		}
	

	}


