package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		//.add(value) is used to add data into ArrayList
		list1.add(3);
		list1.add(6);
		list1.add(1);
		list1.add(9);
		list1.add(5);
		
		System.out.println("Unsorted List: "+list1);//[3,6,1,9,5]
		
		//.get(index) is used to get data on particular index
		int get1=list1.get(3);
		System.out.println("data on index 3 is: "+get1);//9
		
		
		//.add(index,value) is used to add data on a particular index
		list1.add(2,7);
		System.out.println("Aftare adding data in-between: "+list1);//[3,6,7,1,9,5]
		
		//.set(index,value) is used to modify data on particular index
		list1.set(1, 2);
		System.out.println("After modifying data of index 1: "+list1);//[3,2,7,1,9,5]
		
		//.remove(index) is used to remove data of particular index
		list1.remove(4);
		System.out.println("After removing data of index 4: "+list1);//[3,2,7,1,5]
		
		//.size() is used to get size of ArrayList
		int size=list1.size();
		System.out.println("Size of ArrayList: "+ size);//5
		
		//Fetching data of ArrayList using for loop
		System.out.println("Fetch ArraList data using for loop");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i)+" ");//3,2,7,1,5
		}
		
		System.out.println("fetch ArrayList data using foreach loop");
		for(Integer i:list1) {
			System.out.println(i);
		}
		
		
		//Collections.sort(listName) is used to sort an ArrayList in ascending order 
		Collections.sort(list1);
		System.out.println("Sorted List after performing all operations: "+list1);//[1,2,3,5,7]
		
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(23);
		list2.add(45);
		list2.add(56);
		list2.add(89);
		
		System.out.println("List 2: "+list2);//[23,45,56,89]
		
		list2.addAll(list1);
		System.out.println("Merged ArrayList: "+list2);//[23,45,56,89,1,2,3,5,7]
		
		System.out.println(list1.contains(23));//false
		
		list2.clear();
		System.out.println(list2);//[]

	}

}
