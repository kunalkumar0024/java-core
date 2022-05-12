package exceptionHandling;

public class FinnalyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,c=0;
			int d=a/c;
			System.out.println(d);
		}
		catch(Exception e) {
			//It will display exception name and description
			System.out.println(e.toString());
			//finally block will nor work if we call System.exit(status) here
			//System.exit(404);
		}
		finally {
			System.out.println("System is crashing!\nWe are closing the program");
		}

	}

}
