package stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner names=new StringJoiner(",","[","]");
		names.add("Kunal");
		names.add("Om");
		names.add("Nitesh");
		names.add("Prince");
	
		StringJoiner names1=new StringJoiner(",","[","]");
		names1.add("Kunal");
		names1.add("Om");
		names1.add("Nitesh");
		names1.add("Prince");
		
		StringJoiner merge=names.merge(names1);
		System.out.println(merge);
	


	}

}
