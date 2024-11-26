package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass60 {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		ArrayList<String> list1=new ArrayList<String>();
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		list1.add("hari");
		list1.add("avyaan");
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list1.contains(list));
		//System.out.println(list.getLast());
		System.out.println(list.indexOf("Ajay"));
	}

}
