package Task;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<Integer> set1=new TreeSet<>(new MyComparator());
		
		
		set1.add(1);
		set1.add(5);
		set1.add(3);
		set1.add(2);
		set1.add(10);
		set1.add(8);// TODO Auto-generated method stub
		
		System.out.println("Reverse: "+set1);
		
		//HashSet<Integer> setCpy=new LinkedHashSet<>(set1);
		//System.out.println(setCpy);

		
		
	}

}

class MyComparator implements Comparator<Object>{
	public int compare(Object ob1,Object ob2) {
	Integer i1=(Integer)ob1;
	Integer i2=(Integer)ob2;
	
	return -i1.compareTo(i2);
/*
	if(i2<i1) {
		return -1;
	}
	else if(i2>i1) {
		return 1;
	}
	else {
		return 0;
	}
*/
	}
}