package exceptionHandling;
class InvalidAge extends Exception{
	public InvalidAge(String str) {
		super(str);
	}
}
class TestCustom{
	public static void validate(int age) throws InvalidAge{
		if(age<18) {
			throw new InvalidAge("Age is not enough to vote");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCustom ob=new TestCustom();
		try {
			ob.validate(17);
		}
		catch(InvalidAge ee) {
			System.out.println("Exception caught");
			//System.out.println(ee.getMessage());
			
			//It will display exception name, description and stack trace(best way to print exception details)
			ee.printStackTrace();
		}

		System.out.println("Rest of code is working fine");
	}

}
