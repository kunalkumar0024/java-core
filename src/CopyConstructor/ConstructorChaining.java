package CopyConstructor;

public class ConstructorChaining {
	
	ConstructorChaining(){
		//first line should always contain this keyword
		this(5);
		System.out.println("Default Constructor");
	}
	
	ConstructorChaining(int x){
		this(5,15);
		System.out.println(x);
	}
	
	ConstructorChaining(int x, int y){
		//There should be always one constructor without this keyword
		System.out.println(x*y);
	}

	public static void main(String[] args) {
             new ConstructorChaining();
	}

}
