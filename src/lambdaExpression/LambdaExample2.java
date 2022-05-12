package lambdaExpression;
@FunctionalInterface
interface SingleParameter{
	public void getName(String name);
}
public class LambdaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingleParameter ob=(String name)->{
		SingleParameter ob=(name)->{
		//SingleParameter ob=name->{
			System.out.println("Name:"+name);
		};

		ob.getName("Kunal");
	}

}
