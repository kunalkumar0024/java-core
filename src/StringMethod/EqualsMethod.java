package StringMethod;

public class EqualsMethod {
	String name101;
	String name102;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	EqualsMethod ob=new EqualsMethod();
		ob.name101="Kunal";
		ob.name102="Kunal";
		EqualsMethod ob1=new EqualsMethod();
		ob1.name101="Kunal";
		String name="Kunal";
		String name1="Kunal";

		if(name==name1)
			System.out.println(true);
		else
			System.out.println(false);

	
	    
	/* Here it will return true as both string values are equal
	 * But what is the problem with this method of checking String equality
	 * it will assign two different memory location for same string data 
	 * in heap memory's string pool area
	 * than what's the solution?
	 * */
	
		/*if(ob.name101==ob.name101)
		    System.out.println(true);
	    else
		    System.out.println(false);
		    */
		
       /* if(name.equals(name))
        	System.out.println("true");
        else
        	System.out.println("false");
        
        //  == operator is used for checking and comparing
        //  address/reference of given variable
      */
      String ob1=new String("Kunal");
      String ob2=new String("Kunal");
      System.out.println(ob1==ob2);
      System.out.println(ob1.equals(ob2));
      System.out.println("========================");
      String ob3="Kunal";
      String ob4="Kunal";
      System.out.println(ob3==ob4);
      System.out.println(ob3.equals(ob4));
      
        
}
}
