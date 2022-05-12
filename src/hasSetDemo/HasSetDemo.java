//How to Get Elements By Index from HashSet in Java?
//Finding Maximum Element of Java HashSet
//How to iterate through HashSet?
//How to copy Set content to another HashSet?
//How to compare two sets and retain elements which are same on both sets?
package hasSetDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


//import java.util.LinkedHashSet;

public class HasSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<Integer> set1=new LinkedHashSet<>();//Used to get data in ordered manner
		HashSet<Integer> set1=new HashSet<>();//used to get data in non-ordered manner
		set1.add(23);
		set1.add(35);
		set1.add(65);
		set1.add(34);
		set1.add(98);
		
		System.out.println(set1);//[23,35,65,34,98]//here order may not be same
		
		//remove given value as argument from set
		set1.remove(35);
		System.out.println(set1);//[23,65,34,98]
		
		//checks element is present or not
		System.out.println(set1.contains(34));//true
		
		//checks set is empty or not
		System.out.println(set1.isEmpty());//false
		
		//Get element by index
		ArrayList<Integer> list1=new ArrayList<>(set1);
		System.out.println(set1);
		System.out.println(list1.get(3));
		
		//Finding maximum element
		Object ob=Collections.max(set1);
		System.out.println(ob);
		
		//finding minimum element
		Object ob1=Collections.min(set1);
		System.out.println(ob1);
		
		//Iterate set data
		Iterator<Integer> itr=set1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		HashSet<Integer> subSet=new HashSet<>();
		subSet.add(21);
		subSet.add(45);
		subSet.add(87);
		System.out.println(subSet);
		
		//Copy set content to another HashSet
		set1.addAll(subSet);
		System.out.println(set1);
		
		//compare two sets and retain same element present in both sets
		System.out.println(set1.retainAll(subSet));
		System.out.println(set1);
		
		
		//clear the set
		set1.clear();
		System.out.println(set1);
		
	}

}
