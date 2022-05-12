package functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*public class SupplierDemo implements Supplier<LocalDateTime> {
	
	public LocalDateTime get(){
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> supplier=new SupplierDemo();
		System.out.println(supplier.get());

	}

}
*/
public class SupplierDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> supplier=()->LocalDateTime.now();
		
		System.out.println(supplier.get());
		

	}

}