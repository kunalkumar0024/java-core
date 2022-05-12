package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorNewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> list=new ArrayList<>();
		list.add(new Student1(1,"Kunal",23));
		list.add(new Student1(2,"Om",21));
		list.add(new Student1(4,"Nitesh",25));
		
		Comparator<Student1> cmp=Comparator.comparing(Student1::getName);
		Collections.sort(list,cmp);
		System.out.println("Sorting by name:\n");
		for(Student1 st:list) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		Comparator<Student1> cmp1=Comparator.comparing(Student1::getAge);
		Collections.sort(list,cmp1);
		System.out.println("\nSorting by age\n");
		for(Student1 st1:list) {
		System.out.println(st1.rollno+" "+st1.name+" "+st1.age);
	}
		
		Comparator<Student1> cmp2=Comparator.comparing(Student1::getRollno);
		Collections.sort(list,cmp2);
		System.out.println("\nSorting by roll\n");
		for(Student1 st2:list)
			System.out.println(st2.rollno+" "+st2.name+" "+st2.age);
		
	}

}

class Student1{
	
	int rollno;
	String name;
	int age;
Student1(int rollno, String name, int age){
	this.rollno=rollno;
	this.name=name;
	this.age=age;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


}
