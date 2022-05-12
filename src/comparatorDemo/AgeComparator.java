package comparatorDemo;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{
	public int compare(Student age1,Student age2) {
		if(age1.age==age2.age) {
			return 0;
		}
		else if(age1.age>age2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
