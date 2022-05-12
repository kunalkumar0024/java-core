package exceptionHandling;

public class NestedTryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Statement 1
			String name1=null;
			System.out.println(name1.length());
			try {
				//Statement 2
				int arr[]=new int[3];
				arr[5]=23;
				System.out.println(arr[5]);
				try {
					//statement3
					int a=10;
					int b=0;
					int c=a/b;
					System.out.println(c);
				}
				catch(Exception e) {
					//catch 3
					System.out.println(e.getMessage());
				}
			}catch(Exception ee) {
				//catch 2
				System.out.println(ee.getMessage());
			}
		}catch(Exception eee) {
			//catch 1
			System.out.println(eee.getMessage());
		}


	}

}
