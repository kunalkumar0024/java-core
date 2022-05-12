package exceptionHandling;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo ob=new ThrowsDemo();
		ob.m3();

		System.out.println("Rest of code is working fine");
	}
	
	public static void m1() throws IOException{
		throw new IOException("Device Error!!");
	}
	
	public static void m2() throws IOException{
		m1();
	}
	 public static void m3() {
		 try {
			 m2();
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
			 System.out.println("Exception Handled Successfully!!");
		 }
		 
	 }

}
