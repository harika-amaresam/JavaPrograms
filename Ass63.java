package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ass63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		ArrayList<String> list1=new ArrayList<String>();
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		ListIterator itr=list.listIterator();  
		
		System.out.println(itr.previous());
	}

}
