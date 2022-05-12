package CopyConstructor;

public class CopyConstructor {
	
	int id=111;
	double salary=1900;
	
	CopyConstructor(){
		//System.out.println("No argument");
	}

	CopyConstructor(CopyConstructor ob){
		this.id=ob.id;
		this.salary=ob.salary;
		//System.out.println("with argument");
	}

	public static void main(String[] args) {
	       CopyConstructor ob=new CopyConstructor();
	       System.out.println("Id: "+ob.id);
	       System.out.println("salary: "+ob.salary+"\n");
	       
	       CopyConstructor obj=new CopyConstructor(ob);
	       System.out.println("Id: "+obj.id);
	       System.out.println("salary: "+obj.salary);
	       
	       

	}

}
