package InheritanceDemo;
//Parent class cannot inherit properties of its child class
class Animal{
	void m1() {
		System.out.println("I am parent");
	}
}
//Only child class can take properties of its immediate parent class 
class Cow extends Animal{
	void m2() {
		System.out.println("I am child");
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		Cow ob=new Cow();
		ob.m1();
		ob.m2();
	}

}
