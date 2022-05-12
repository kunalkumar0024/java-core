package lambdaExpression;
@FunctionalInterface
interface Drawable{
	public void findAge();
}
public class LambdaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=23;
		
		//Lambda Expression without any argument
		Drawable d=()->{
			System.out.println("Age="+age);
		};
		d.findAge();

	}

}
