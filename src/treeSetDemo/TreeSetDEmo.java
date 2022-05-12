package treeSetDemo;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set1=new TreeSet<>();// get data in sorted format
		set1.add(23);
		set1.add(35);
		set1.add(65);
		set1.add(34);
		set1.add(98);
		
		System.out.println(set1);//[23,34,35,65,98]
		
		//remove given set data
		set1.remove(35);
		
		System.out.println(set1);//[23,34,65,98]
		
		//checks given data present in set or not
		System.out.println(set1.contains(34));//true
		
		//checks set is empty or not
		System.out.println(set1.isEmpty());//false
		
		//fetch TreeSet data using iterator
		Iterator<Integer> itr=set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//clear set data
		set1.clear();
		System.out.println(set1);//[]


}

}
