package exceptionHandling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation ob=new ExceptionPropagation();
		try {
		ob.mix();
		}catch(NullPointerException e) {
			System.out.println("Exception Handled successfully!");
		    e.printStackTrace();
		}
		// ob.animal();

	}

	public static void animal() {
		String species=null;
		System.out.println(species.length());
	}
	public static void bird() {
	      animal();
	}

	public static void mix() {
		bird();
	}
	
	}
