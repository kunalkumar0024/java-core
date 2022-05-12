package hashMapDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Kunal");
		map.put(2, "Rahul");
		map.put(3, "Prince");
		map.put(4, "Appu");
		System.out.println(map+"\n");
		
		System.out.println(map.keySet()+"\n");
		
		System.out.println(map.values()+"\n");
		
		TreeSet<String> name= new TreeSet<>(map.values());
		TreeSet<Integer> roll= new TreeSet<>(map.keySet());
		
		System.out.println("\n\n"+name+"\n\n");
		
		System.out.println(roll+"\n");
		
	    
	    ArrayList<String> newName=new ArrayList<>(map.values());
	    Collections.sort(newName);
	    System.out.println("\nPrinting names ........\n");
	    
	    Iterator<String> itr=newName.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    
	    ArrayList<Integer> newKey=new ArrayList<>(map.keySet());
	    Collections.sort(newKey);
	    System.out.println("\nPrinting roll no. .............\n");
	    
	    Iterator<Integer> itr1=newKey.iterator();
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	    
	    
	}

}


		//It checks that particular key is present in HashMap or not
		
		//System.out.println(map.containsKey(3));
		
		//System.out.println(map.putIfAbsent(4, "Appu"));
		
		//Return all keys that are present in HashMap
		
		
		//Return all values that are present in HashMap
		
		
		
		//checks that given value is present or not and return boolean value
		
		//System.out.println(map.containsValue("Kunal"));
		
		//Checks that hashMap is empty or not and return boolean value
		
		//System.out.println(map.isEmpty());
		
		//Convert Map values into sorted set
		
		
		
	/*	//fetch values
		
		Collection<String> values = map.values();
	    String[] arr = values.toArray(new String[0]);
	    
	    for(int i=0;i<map.size();i++) {
	    	System.out.println(arr[i]);
	    }
	   
	    //fetch keys
	    
	    Collection<Integer> keys = map.keySet();
	    Object[] arr1 = keys.toArray();
	    
	    for(int i=0;i<map.size();i++) {
	    	System.out.println(arr1[i]);
	    }
	  */
	    
	    
		//clear all data from HashMap
	    
		//map.clear();
		//System.out.println(map);

