package Task;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetOperation {

	public static void main(String[] args) {
		HashSet<Integer> set1=new LinkedHashSet<>();
		
		set1.add(1);
		set1.add(5);
		set1.add(3);
		set1.add(2);
		set1.add(10);
		set1.add(8);
				
		TreeSet<Integer> set2=new TreeSet<>();
		set2.addAll(set1);
		
		TreeSet<Integer> reverse=(TreeSet<Integer>)set2.descendingSet();
		
		//TreeSet<Integer> set3=new TreeSet<Integer>(new MyComparator());
		//set3=(TreeSet<Integer>)set1.clone();
		//System.out.println(set3.isEmpty());
		//System.out.println("SET3"+set3);
		
		
		
		
		System.out.println("\nTreeSet Default Output:"+set2);
		
		System.out.println("\nReverse Order (sorted): "+reverse);
		
		System.out.println("\nOriginal input: "+set1);

		
		
	}

	

}

/*class MyComparator1 implements Comparator<Object>{
	public int compare(Object ob1,Object ob2) {
	Integer i1=(Integer)ob1;
	Integer i2=(Integer)ob2;
	return -i1.compareTo(i2);
	
	}
}
*/