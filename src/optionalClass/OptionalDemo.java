package optionalClass;

import java.util.Optional;

public class OptionalDemo {
	public static Optional<String> getName(){
		String name="Kunal Singh";
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> nameOp=getName();
		System.out.println(nameOp.orElse("Null Value"));

	}

}
