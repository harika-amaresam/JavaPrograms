package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Ass70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String,String> gfg = new HashMap<String,String>();
		    
	        // enter name/url pair
	        gfg.put("GFG", "gig.org");
	        gfg.put("Practice", "practice.org");
	        gfg.put("Code", "cod.org");
	        gfg.put("Quiz", "www.facebook.com");
	        
	        // using keySet() for iteration over keys
	        for (String name : gfg.keySet()) 
	            System.out.println("key: " + name);
	        
	        // using values() for iteration over values
	        for (String url : gfg.values()) 
	            System.out.println("value: " + url);
	}

}
