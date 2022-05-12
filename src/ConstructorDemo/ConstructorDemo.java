package ConstructorDemo;

class Main{
	int id;
	String name;
	double salary;
	//constructor of class Main with no arguments
	Main(){
		System.out.println("Constructor called");
	}
	//constructor of class Main with 2 arguments
	Main(int id,String name){
		this.id=id;
		this.name=name;
	}
	//constructor of class Main with 3 arguments
	Main(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
	    	
           Main ob=new Main(101,"Kunal Kumar Singh");
           System.out.println("Id: "+ob.id);
           System.out.println("Name: "+ob.name);
           System.out.println();
           
           ob=new Main();
           
           ob=new Main(105,"Kunal",10000);
           System.out.println("\nId: "+ob.id);
           System.out.println("Name: "+ob.name);
           System.out.println("salary: "+ob.salary);
           
           ob=new Main(102,"Kunal Kumar",10000);
           System.out.println("\nId: "+ob.id+"\nName: "+ob.name+"\nsalary: "+ob.salary);
           
           
           
	}

}
