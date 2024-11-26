package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Ass64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(); 
		  
        // add elements to the list 
      list.add("hari"); 
      list.add("chandu"); 
      list.add("sek"); 

        // Iterate through the list 
      list.forEach( 
          (element) -> { System.out.println(element); }); 
	}

}
