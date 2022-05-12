package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(23,"Kunal",24));
		list.add(new Student(25,"Om",23));
		list.add(new Student(18,"Nitesh",19));
		
		System.out.println("\nSorting by Name");  
		  
		Collections.sort(list,new NameComparator());  
		for(Student st: list){  
		System.out.println(st.roll+" "+st.name+" "+st.age);  
		}  

		
		System.out.println("\nSorting by age");  
		  
		Collections.sort(list,new AgeComparator());  
		for(Student st: list){  
		System.out.println(st.roll+" "+st.name+" "+st.age);  
		} 
		
		System.out.println("\nSorting by roll");  
		  
		Collections.sort(list,new RollComparator());  
		for(Student st: list){  
		System.out.println(st.roll+" "+st.name+" "+st.age);  
		} 
		
	}

}
