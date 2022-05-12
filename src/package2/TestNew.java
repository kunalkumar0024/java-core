package package2;
 class Test{
	protected void displayDemo() {
    //protected void displayDemo() {
		System.out.println("Only Test can access");
	}
}
public class TestNew{
	//extend Test class to access private methods of Test class 
	//public class TestNew extends Test{
         public void display() {
        	 System.out.println("Anyone can access me");
         }
	public static void main(String[] args) {
		
           TestNew obj=new TestNew();
           obj.display();
           
           //obj.displayDemo();
           //create object for Test class
           Test ob=new Test();
           //only after creating object of test class we can access displayDemo method
           ob.displayDemo();

	}

}
