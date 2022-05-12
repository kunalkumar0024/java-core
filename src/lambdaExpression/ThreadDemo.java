package lambdaExpression;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable thread1=()->{
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				try {
				Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Runnable thread2=()->{
			for(int i=1;i<=10;i++) {
				System.out.println(i*2);
				try {
					Thread.sleep(1000);
				}catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		};
		Thread t=new Thread(thread1);
		t.start();
		Thread t1=new Thread(thread1);
		t1.start();

		Thread t2=new Thread(thread2);
		t2.start();
	}

}
