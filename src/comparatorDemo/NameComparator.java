package comparatorDemo;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	public int compare(Student name1,Student name2){
	
		return name1.name.compareTo(name2.name);
	}
}

