package assignmentPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Student{
	int id;
	String name;
	double salary;
	@Override
	public String toString()
	{
		return id+" "+name+" "+salary;

	}

	//constructor of class Student with 3 arguments
	Student(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=(new Student(1,"Kunal Singh",10000f));
		Student s2=(new Student(2,"Prince Kumar",19000f));
		Student s3=(new Student(3,"Om Prakash Pan",100600f));
		Student s4=(new Student(4,"Nitesh Kumar",102000f));
		Student s5=(new Student(5,"Appu",101000f));
		Student s6=(new Student(6,"Shekhar Baarik",109000f));
		
		ArrayList<Student> stDetails=new ArrayList<>();
		stDetails.add(s1);
		stDetails.add(s2);
		stDetails.add(s3);
		stDetails.add(s4);
		stDetails.add(s5);
		stDetails.add(s6);
		
		//System.out.println(stDetails);
		
		/*for(Student i:stDetails) {
			System.out.println(i);
		}*/
		System.out.println("\n");
		HashMap<String,Student> map=new LinkedHashMap<>();
		map.put(s1.name, s1);
		map.put(s2.name, s2);
		map.put(s3.name, s3);
		map.put(s4.name, s4);
		map.put(s5.name, s5);
		map.put(s6.name, s6);
		
		
				/*for(Student st:map.keySet()).merge(map.values()) {
					//for(String st1:map.keySet()) {
					//System.out.println(st1+" :"+st);
			        System.out.println(st);
				}       
		   }*/
		for(Map.Entry<String,Student> entry:map.entrySet()) {
		System.out.println(entry.getKey()+": "+entry.getValue());
		}

}
}
