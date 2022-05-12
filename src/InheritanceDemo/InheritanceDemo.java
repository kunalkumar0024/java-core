package InheritanceDemo;
class InheritanceDemo {
	public void pattern() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("*"+j);
			}
			System.out.println(" ");
		}
	}
}
	
class Demo extends InheritanceDemo{
	public void pattern2() {
		for(int i=5;i>=1;i--) {
			for(int j=0;j<5;j++) {
				System.out.println("*"+j);
			}
			System.out.println(" ");
		}
	}
}

class Main{
	public static void main(String args[]) {
		Demo d=new Demo();
		d.pattern();
		d.pattern2();
	}
}