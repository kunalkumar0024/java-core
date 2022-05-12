package functionalInterface;

import java.util.function.Predicate;

/*public class PredicateDemo implements Predicate<Integer> {
	public boolean test(Integer t) {
		if(t%2==0)
			return true;
			else
				return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate=new PredicateDemo();
		System.out.println(predicate.test(9));

		

	}

}
*/
public class PredicateDemo{
	public static void main(String[] args) {
		Predicate<Integer> predicate=t->t%2==0?true:false;
		System.out.println(predicate.test(10));

	}
}