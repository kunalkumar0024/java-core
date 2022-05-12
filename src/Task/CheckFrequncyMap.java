package Task;

import java.util.HashMap;

public class CheckFrequncyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello World";
		
		HashMap<Character,Integer> charFrequency=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			Character ch=str.charAt(i);
			
			if(charFrequency.containsKey(ch)) {
				
				int count=charFrequency.get(ch);
				charFrequency.put(ch,count+1);
			}
			
			else {
				
				charFrequency.put(ch,1);
			}
		}
		
		System.out.println(charFrequency);
		

	}

}
