package lambdaExpression;
@FunctionalInterface
interface GetDetails{
	public void studentDetails(int id,String name,float marks);
}
public class LambdaExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDetails ob1=(int id, String name,float marks)->{
			System.out.println("Id: "+id+" Name: "+name+" Marks: "+marks);
		};

		ob1.studentDetails(23, "Kunal", 76.6f);
	}

}
