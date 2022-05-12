package InterfaceDemo;
interface Printable{
	void print();
}
interface Showable{
	void show();
}


public class DeoInterface implements Printable,Showable {
	public void print() {
		System.out.println("Printable");
	}
	public void show() {
		System.out.println("Showable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeoInterface ob=new DeoInterface();
        ob.print();
        ob.show();
	}

}
