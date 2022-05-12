package stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner name=new StringJoiner(" / ");
		//It prints nothing because string is empty
		System.out.println(name);
		
		name.setEmptyValue("This set is empty");
		System.out.println(name);
		
		name.add("Kunal");
		name.add("Om");
		name.add("Nitesh");
		name.add("Prince");
		
		int length=name.length();
		System.out.println(name);
		System.out.println("Length of String Joiner: "+length);
		name.add("Kamal");
		name.add("Liku");
		
		System.out.println(name);
		System.out.println("Current length: "+name.length());
	

	}

}
