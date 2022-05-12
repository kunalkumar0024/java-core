package lambdaExpression;
@FunctionalInterface
interface Addition{
	public int add(int num1,int num2);
}
public class LambdaExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda Expression without return keyword
		    Addition ob=(int num1,int num2)->(num1+num2);
			System.out.println(ob.add(20,30));
			
			//Lambda Expression with return keyword
			Addition ob1=(num1,num2)->{
				return (num1+num2);
			};
			System.out.println(ob1.add(40,60));

	}

}
