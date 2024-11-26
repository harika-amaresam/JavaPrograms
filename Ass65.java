package Assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ass65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new LinkedList<>();
	       
        names.add("Welcome");
        names.add("To");
        names.add("gtm");
 
        // Getting ListIterator
        ListIterator<String> namesIterator
            = names.listIterator();
 
        // Traversing elements using next() method 
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
	}

}
