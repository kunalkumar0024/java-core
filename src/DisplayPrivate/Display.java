package DisplayPrivate;
//import package2.*;
//import package package1 to access features of Test Class
import package1.*;
//Inherit Test class(Parent) to Display class(Child) to access protected methods
public class Display extends Test{
	
private void display1() {
	System.out.println("Privte to class Display");
}

	public static void main(String[] args) {
	//create object for Display class 	
     Display obj=new Display();
     //access private method of same class
     obj.display1();
     //access protected method of different class from different package by importing package of that class
     obj.display();
    // obj.displayDemo();
	}

}
