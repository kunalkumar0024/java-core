package Task;

class CheckDivisibility{
	void checkDivisibility() {
		//int helloWorldCount=0;
		//int helloCount=0;
		//int worldCount=0;
		//int numCount=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Hello World !");
				//helloWorldCount++;
;			}
			else if(i%5==0) {
				System.out.println("World");
				//worldCount++;
			}
			else if(i%3==0) {
				System.out.println("Hello");
				//helloCount++;
			}
			else {
				System.out.println(i);
				//numCount++;
			}
		}
		//System.out.println("\n\nNo. of times Hello printed: "+helloCount);
		//System.out.println("\nNo. of times World printed: "+worldCount);
		//System.out.println("\nNo. of times Hello World printed: "+helloWorldCount);
		//System.out.println("\nNo. of times numbers printed: "+numCount);
		
		
	}
	
}

public class DisplayDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CheckDivisibility ob=new CheckDivisibility();
         ob.checkDivisibility();
	}

}
