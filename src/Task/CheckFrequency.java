package Task;

class CountFrequencyOfChar{
	
	void countFrequency() {
		
	String str="Hello World";
	int frequency[]=new int[str.length()];
	char str1[]=str.toCharArray();
	
	for(int i=0;i<str.length();i++) {
		
		frequency[i]=1;
		
		for(int j=i+1;j<str.length();j++) {
			
			if(str1[i]==str1[j]) {
				
				frequency[i]++;
				str1[j]='0';
			}
		}
	}
	
	System.out.println("Frequency of char is :");
	
	for(int i=0;i<frequency.length;i++) {
		
		if(str1[i]!=' ' && str1[i]!='0') {
			
			System.out.println(str1[i]+" "+frequency[i]);
		}
	}
}
}
	
public class CheckFrequency {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CountFrequencyOfChar ob=new CountFrequencyOfChar();
		ob.countFrequency();
		

	}

}
