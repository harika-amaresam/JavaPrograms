package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ass72 {
	boolean checkForKey(String keyToBeChecked)
    {
 
        
        HashMap<String, Integer> hashMap = 
          new HashMap<>();
 
        
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        hashMap.put("fourth", 4);
 
       
        ArrayList<String> listOfKeys
            = new ArrayList<>(hashMap.keySet());
 
        
        Iterator<String> itr = listOfKeys.iterator();
 
       
        while (itr.hasNext()) {
 
            
            if (itr.next() == keyToBeChecked)
            {
                System.out.println(keyToBeChecked);
            	return true;
        }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ass72 ob = new Ass72();
		 
	        
	        System.out.println(ob.checkForKey("first"));
	}

}
