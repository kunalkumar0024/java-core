//Write a Java program to create a new array list, add some colors (string) and print out the collection. 
//Write a Java program to iterate through all elements in a array list
//Write a Java program to insert an element into the array list at the first position
//Write a Java program to retrieve an element (at a specified index) from a given array list.
//Write a Java program to update specific array element by given element.
//Write a Java program to remove the third element from a array list.
//Write a Java program to search an element in a array list.
//Write a Java program to sort a given array list.
// Write a Java program to copy one array list into another.
//Write a Java program to shuffle elements in a array list.
//Write a Java program to reverse elements in a array list
//Write a Java program to compare two array lists.
//Write a Java program of swap two elements in an array list
//Write a Java program to join two array lists. 
//Write a Java program to empty an array list
//Write a Java program to test an array list is empty or not.
//Write a Java program to trim the capacity of an array list the current list size.
//Write a Java program to increase the size of an array list
//Write a Java program to replace the second element of a ArrayList with the specified element.
//Write a Java program to print all the elements of a ArrayList using the position of the elements
package arrayListDemo;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<>();
		
		color.add("Green");
		color.add("Blue");
		color.add("Red");
		color.add("Yellow");
		color.add("Sky Blue");
		color.add("Forest Green");
		
		//fetch ArrayList data 
		System.out.println(color);
		
		//Using iterator
		for(int i=0;i<color.size();i++) {
			System.out.println(color.get(i));
		}
		
		//add element at first position
		color.add(0,"Pink");
		System.out.println(color);
		
		//retrieve element from specific position
		System.out.println(color.get(3));
		
		//Update specific array element
		color.set(1, "Black");
		System.out.println(color);
		
		//Remove third element from ArrayList
		color.remove(2);
		System.out.println(color);
		
		//Search element in ArrayList
		System.out.println(color.get(5));
		
		//Sort ArrayList in ascending order
		Collections.sort(color);
		System.out.println(color);
		
		ArrayList<String> newColor=new ArrayList<>();
		newColor.add("green");
		newColor.add("White");
		newColor.add("Brown");
		newColor.add("Gray");
		System.out.println(newColor);
		
		//Copy one ArrayList into another
		color.addAll(newColor);
		System.out.println(color);
		
		//Shuffle elements
		Collections.shuffle(color);
		System.out.println(color);
		
		//Reverse elements
		Collections.reverse(color);
		System.out.println(color);
		
		//List<String> subColor=color.subList(0, 4);
		
		//Compare two ArrayList values
		ArrayList<String> sub=new ArrayList<>();
		for(String e:newColor) {
			sub.add(color.contains(e)?"Yes":"No");
		}
		System.out.println(sub);
		
		//Swap two values
		Collections.swap(color,0,3);
		System.out.println(color);
		
		//clone the ArrayList 
		ArrayList<String> col=(ArrayList<String>)newColor.clone();
		System.out.println(col);
		
		//Clear the ArrayList
		col.clear();
		System.out.println(col);
		
		//checks ArrayList is empty or not
		System.out.println(col.isEmpty());
		
		//Reduce the size of ArrayList to current list size
		color.trimToSize();
		System.out.println(color);
		
		//Increase the capacity to 20
		color.ensureCapacity(20);
		
		
		

	}

}
