package functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
  /*  public void accept(String t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer=new ConsumerDemo();
		consumer.accept("Kunal Singh");
	}
  */
	
	public static void main(String[] args) {
		Consumer<String> consumer=(t)->System.out.println(t);
		consumer.accept("Kunal Singh");
		
		Consumer<String> consumer2=(input)->System.out.println(input+" World!");
		Consumer<String> consumer3=(input)->System.out.println(input+" Kunal!");
		consumer2.andThen(consumer3).accept("Hello");
		}
}
