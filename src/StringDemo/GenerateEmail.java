package StringDemo;
class StoreUserDetails{
	protected void emailGenerator() {
	    	
	}
}
public class GenerateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="101023";
		String firstName="kunal";
		String lastName="singh";
	    String domain="iserveu.ac.in";
	    //domain.contains checks that whether given data is present in string or not
	    if((firstName.charAt(0)>=97 || firstName.charAt(0)>=122) && (domain.contains("iserveu.ac.in")))
	    	//concat method merge two different strings into a single string
	    System.out.println("your emaild is: "+firstName.concat(lastName).concat(id).concat("@").concat(domain));
	    else
	    	System.out.println("Wrong data inputted/fetched !");
	}

}
