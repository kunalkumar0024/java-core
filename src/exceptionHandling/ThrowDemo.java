package exceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		checkEligibility(17);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void checkEligibility(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible for vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
	}

}
