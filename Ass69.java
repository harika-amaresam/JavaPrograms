package Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ass69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> gfg = new HashMap<String,String>();
	    
        // enter name/url pair
        gfg.put("GG", "vaxhabx.com");
        gfg.put("Practice", "nsjxjs.org");
        gfg.put("Code", "cosjdhj.in");
        gfg.put("Quiz", "www.googble.com");
        
        // using iterators
        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();
        while(itr.hasNext())
        {
             Map.Entry<String, String> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
        }
                  
	}

}
