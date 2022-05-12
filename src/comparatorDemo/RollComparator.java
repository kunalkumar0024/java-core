package comparatorDemo;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {
	public int compare(Student roll1, Student roll2) {
		if(roll1.roll==roll2.roll) {
			return 0;
		}
		else if(roll1.roll>roll2.roll) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
