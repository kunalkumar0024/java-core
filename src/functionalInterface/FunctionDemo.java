package functionalInterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Function<String,Integer> function=new Function<String,Integer>(){
		public Integer apply(String name) {
			return name.length();
		}
	};

	    System.out.println(function.apply("Kunal Singh"));	
   */
		Function<String,Integer> function=t->t.length();
		System.out.println(function.apply("Kunal Singh"));
	}

}
