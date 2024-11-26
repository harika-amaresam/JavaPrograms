package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ass71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> gfg = new HashMap<String,Integer>();
	    
        // enter name/url pair
        gfg.put("Apple", 4);
        gfg.put("banana", 2);
        gfg.put("orange", 5);
        gfg.put("kiwi", 1);
        for (Entry<String, Integer> entry : gfg.entrySet()) 
        	System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());

        for (int url : gfg.values()) 
            System.out.println("value: " + url);   
        gfg.remove("banana");
        for (String name : gfg.keySet())
        {
        	
             
             System.out.println("key: " + name);
        }          
	}

}
