package AbstractDemo;
abstract class Main{
	abstract void shape();
}
class Main_Demo extends Main{
	public void shape() {
		System.out.println("Hello");
	}
}
class Circle extends Main{
	public void shape() {
		System.out.println("Shape is Round");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle ob=new Circle();
        ob.shape();
        
	}

}
