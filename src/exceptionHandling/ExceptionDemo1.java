package exceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write code that can create an exception
		try {
			int a=10;
			int b=0;
			int c= a/b;
			System.out.println(c);
			int[] arr=new int[5];
			arr[7]=10;
			System.out.println(arr[7]);
			
			
		}
		//here we can handle exception
		catch(ArithmeticException e) {
			//This will display only description
			System.out.println("Number cannot be "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException eee) {
			System.out.println("Index not found!");
		}
		
		try {
			String name=null;
			System.out.println(name.length());
		}catch(NullPointerException ee) {
			System.out.println("Name is NULL!");
		}
		
		System.out.println("This is important code"+ " "+"It must work");
		
		
	}

}
