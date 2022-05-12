package StringDemo;
class CountFrequencyOfChar{
	String sentance;
	public void countFrequencyOfChar() {
		int count=0;
		for(int i=0;i<sentance.length()-1;i++) {
			if(sentance.charAt(i)=='a') {
			 count++;	
			}
		}
		System.out.println(count);
	}
}

public class StringDemo {

	public static void main(String[] args) {
		
	     System.out.println("Check Frequency");
		// TODO Auto-generated method stub
		String name="Kunal Kumar";
		String name1="Kunal Kumar";
		String name3="Kunal kumar";
		String name2;
		
		CountFrequencyOfChar ob=new CountFrequencyOfChar();
		ob.sentance="This is a sentance";
		ob.countFrequencyOfChar();
		
		//It checks that whether two string values at same address are same or not
		System.out.println( name==name1);
		System.out.println(name.length());
		
		new String(name2="Kunal Singh");
		System.out.println(name2);
		
		System.out.println("\n\nCharAt ()");
		//It returns the character of a given string of given index
		System.out.println(name.charAt(2));
		System.out.println(name1.charAt(name1.length()-2));
		
		
		System.out.println("\n\ncompareTo()");
		//compare two strings and if strings are same than return 0
		//otherwise return +ve or -ve values
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareTo(name2));
		System.out.println(name2.compareTo(name));
		
		
		System.out.println("\n\nendsWith()");
		//endsWith method checks that whether the given substring is there in
		//string or not if present than output will be true otherwise false
		System.out.println(name1.endsWith("Kumar"));
		
		System.out.println("\n\nequals()");
		//equals method checks that whether two given string values are same or not
		//if same than return true otherwise false
		System.out.println(name.equals(name2));
		
		System.out.println("\n\nequalsIgnorecase()");
		//equalsIgnoreCase checks two strings are same or not
		//and ignore the case of strings
		System.out.println(name.equalsIgnoreCase(name3));
		
		
		System.out.println("\n\nString.format()");
		//string format() method returns the formatted string by given locale
		//and format and arguments.
		String student=String.format("Student Name is %s", name);
		String age=String.format("and age is %.2f",23.7);
		System.out.println(student+" "+age);
		
		
		System.out.println("\n\ngetBytes()");
		//It will return ASCI values of characters which are present in string
		String byteCode="Kunal";
		byte arr[]=byteCode.getBytes();
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\n\nindexOf()");
		String sentance2="This is Kunal Kumar";
		System.out.println("indexOf()");
		//returns the index of index substring  
		int index=sentance2.indexOf("is");
		System.out.println("\n"+index);
		
		//returns the index of substring after 4th index 
		int index1=sentance2.indexOf("is",4);
		System.out.println(index1);
		
		//returns the index of char
		int index2=sentance2.indexOf('s');
		System.out.println(index2);
		
		
		System.out.println("\n\nintern()");
		//intern method return string from memory if it is created by a new keyword. 
		//It creates an exact copy of the heap string object in the String Constant Pool.
		String s1=new String("ABC");
		String s2="ABC";
		System.out.println(s1==s2);
		
		s1=s1.intern();
		s2=s2.intern();
		System.out.println(s1==s2);
		
		
		System.out.println("\n\nisEmpity()");
		// isEmpty() method checks if the input string is empty or not
		String empty="";
		String emptyOrNot="Kunal";
		
		//isEmpty method is not suitable for checking null values 
		//hence it will give NullPointerException
		//String nullDemo=null;
		
		System.out.println(empty.isEmpty());
		System.out.println(emptyOrNot.isEmpty());
		
		//System.out.println(nullDemo.isEmpty());
		
		
		System.out.println("\n\njoin()");
		//join() method returns a string joined with a given delimiter.
		String joinString=String.join("-","Kunal","is", "doing","mca");
		System.out.println(joinString);
		
		//here NullPointerException will arise
		//String st1=String.join(null,"Trident","College",null);
		
		//This will work fine
		String st1=String.join("*","Trident","College",null);
		System.out.println(st1);
	
		
		String str10="This is of an example of lastIndexOf()";
		
	    System.out.println("\n\nlastIndexOf()");
		//this will search index value of char on which index it is present
		//and return index-1
		int str101=str10.lastIndexOf('e');
		System.out.println(str101);
		
		//This will check till given index value that given char is present
		//on which index and return index-1
		int str110=str10.lastIndexOf('i',3);
		System.out.println(str110);
		
		
		//It will return substring's first char present on index-1
		int str111=str10.lastIndexOf("of");
		System.out.println(str111);
		
		//It will check till given index value and 
		//return substring's first char present on index-1
		int str121=str10.lastIndexOf("of",10);
		System.out.println(str121);
		
		
		//If given substring is not found, it will return -1
		int str131=str10.lastIndexOf("of",3);
		System.out.println(str131);
		
		
		System.out.println("\n\nlength()");
		//It will return length of given string
		System.out.println(str10.length());
		
		//It will throw NullPointerException
		//String str1010=null;
		//System.out.println(str1010.length());
		
	
		
		String replace="This * was replaceble";
		
		System.out.println("\n\nreplace()");
		//It will replace old char/substring with new char/substring
		//here we can change any char to another
		String replaceDemo=replace.replace("was", "is");
		String replaceChar=replace.replace('*','#');
		System.out.println(replaceDemo);
		System.out.println(replaceChar);
		
		//String replace1="This * was replaceble";
		
		//Here we cannot replace special char to another
		//it will throw PatternSyntaxException
		//String repChar=replace1.replaceAll("*", "@");
		
		//replaceAll(String old,String new) always take only string value
		String repChar1=replace.replaceAll("s","a");
		System.out.println(repChar1);
		String repString=replace.replaceAll("was", "is");
		System.out.println(repString);
		
		
		System.out.println("\n\nsplit()");
		//It will split the string based on whitespace
		String split1="\nThis is a java program";
		String split101[]=split1.split("\\s");
		
		for(String display:split101) {
			
		System.out.println(display);
		
		}
		
		//It will split the String till 2 whitespace 
        String split1010[]=split1.split("\\s",4);
		
		for(String display:split1010) {
			
		System.out.println(display);
		
		}
	
		
		System.out.println("\n\nstartswith()");
		String startW="Java String method stratsWith() example";
		//startsWith() method checks if this string starts with the given prefix. 
		//It returns true if this string starts with the given prefix; 
		//else returns false.
		System.out.println(startW.startsWith("Ja"));// true
		System.out.println(startW.startsWith("ja"));// false
		System.out.println(startW.startsWith("Java String"));// true
		System.out.println(startW.startsWith(" Java String"));// false because String starts with blank field
	
	
		System.out.println("\n\nsubstring()");
		String sub="substring";
		//Starts with 0 and goes to end  
		String subStr=sub.substring(0);
		System.out.println(subStr);
		//Starts with 2 and go till end
		String subStr1=sub.substring(2);
		System.out.println(subStr1);
		//Starts with 2 and go till 5
		String subStr2=sub.substring(2,5);
		System.out.println(subStr2);
		
	
		System.out.println("\n\ntoChar()");
	    //toCharArray() method converts this string into character array.
		//It returns a newly created character array, its length is similar to 
		//this string and its contents are initialized with the characters of this string.
		String charArr="Trident";
		char ch[]=charArr.toCharArray();
		for(int i=0;i<charArr.length();i++) {
			System.out.println(ch[i]);
		}
	    
		System.out.println("\n\ntoLowerCase()");
    	//It will convert upper case char into lower case of given String 
		String toLow="THiS IS ExaMPLe";
		String convertToLow=toLow.toLowerCase();
		System.out.println(convertToLow);
	
		System.out.println("\n\ntoUpperCase()");
		//It will convert lower case char into upper case of given String 
		String toUp="this is uppeR";
		String convertToUp=toUp.toUpperCase();
		System.out.println(convertToUp);
	
		
		System.out.println("\n\ntrim()");
		//trim() method eliminates leading and trailing spaces. 
		//The trim() method in Java string checks this Unicode value before and after the string
		String tr="Welcome to ";
		System.out.println(tr+"iserveu");
		System.out.println(tr.trim()+"iserveu");
	
		
		System.out.println("\n\nvalueOf()");
		//valueOf() method converts different types of values into string. 
		//Convert int to string,
		//long to string,
		//boolean to string,
		//character to string,
		//float to string, 
		//double to string,
		//object to string and 
		//char array to string.
		
		int val=80;
		String valOf=String.valueOf(val);
		System.out.println(valOf+10);
	}
	

}
