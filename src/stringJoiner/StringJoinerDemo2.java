package stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner names=new StringJoiner(",","[","]");
		names.add("Kunal");
		names.add("Om");
		names.add("Nitesh");
		names.add("Prince");
		
		System.out.println(names);


	}

}
