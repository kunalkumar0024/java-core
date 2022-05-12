package exceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			try {
				String name=null;
				System.out.println(name.length());
			}catch(NullPointerException ee) {
				System.out.println("Name is"+ee.getMessage());
			}
			
			try {
				int a=10;
				int b=0;
				int c= a/b;
				System.out.println(c);
				
			}
			//here we can handle exception
			catch(ArithmeticException e) {
				System.out.println("Number cannot be "+e.getMessage());
			}
			
			
			try {
				int[] arr=new int[5];
				arr[7]=10;
				System.out.println(arr[7]);	
			}catch(ArrayIndexOutOfBoundsException eee) {
				System.out.println(eee.getMessage()+" Not found");
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception handled successfully");
		}

	}

}
