package StringDemo;

public class TestStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Kunal";
		String lastName="Singh";
		
		System.out.println("Length of String is: "+firstName.length());
		System.out.println("Compare firstName is equals to lastName or not: "+firstName.compareTo(lastName));
		System.out.println("Adding two Strings together: "+firstName.concat(" "+lastName));
        System.out.println("Addingg another two Strings: "+firstName.concat("@").concat(lastName));
	}

}
