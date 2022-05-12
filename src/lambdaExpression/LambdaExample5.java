package lambdaExpression;
@FunctionalInterface
interface SaySomething{
	public String say(String message);
}
public class LambdaExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaySomething ob=(message)->{
			String str1="My name is :";
			String str2=str1+message;
			return str2;
		};
		

		System.out.println(ob.say("Kunal"));
	}

}
