package Task;

public class ReverseDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance="This is Kunal";
		System.out.println(sentance+"\n");
		
		String sub1=sentance.substring(0,4);
		String sub2=sentance.substring(4,8);
		String sub3=sentance.substring(8,13);
		
		System.out.println(sub3+sub2+sub1);
	}

}
