package exceptionHandling;

import java.io.IOException;

class Parent{
	//void msg() throws IOException {
	//void msg() throws ArithmeticException {
		void msg() {
		System.out.println("Parent class");
	}
}
class Child extends Parent{
	//Here it will create an exception because it is checked exception and superclass method has not declared the exception
	//void msg() throws IOException{
	void msg() throws ArithmeticException{
		System.out.println("Child class");
	}
}
public class OverRidingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob=new Child();
		//if it gives error, means it declare parent exception
		ob.msg();

	}

}
