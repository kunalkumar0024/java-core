package InheritanceDemo;
class Parent{
	void grandfather() {
		System.out.println("I am grand father");
	}
	
}
//example of single inheritance
class Child extends Parent{
	void father() {
		System.out.println("I am father");
	}
}
//example of multilevel inheritance
class GrandSon extends Child{
	void son() {
		System.out.println("I am son");
	}
}
//example of hierarchical inheritance 
class GrandDaughter extends Parent{
	void daughter() {
		System.out.println("I am daughter");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          GrandSon ob=new GrandSon();
          ob.grandfather();
          ob.father();
          ob.son();
          //Compile-time error
          //It can access only its immediate parent class
          //It can be solved after creating instance for GrandDaughter class
          GrandDaughter ob1=new GrandDaughter();
          ob1.daughter();
	}

}
