package multiThreading;

class ThreadEx implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
	}
}

public class JoinThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx t1=new ThreadEx();
		ThreadEx t2=new ThreadEx();
		ThreadEx t3=new ThreadEx();
		ThreadEx t4=new ThreadEx();
		
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		Thread tt3=new Thread(t3);
		Thread tt4=new Thread(t4);
		
		
		tt1.start();
		tt1.setName("Thread 1");
		try { 
			System.out.println(Thread.currentThread().getName());
			tt1.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		tt2.start();
		tt2.setName("Thread 2");
		try { 
			System.out.println(Thread.currentThread().getName());
			tt2.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		tt3.setPriority(9);
		tt3.start();
		tt3.setName("Thread 3");  
		
		try { 
			System.out.println(Thread.currentThread().getName());
		   // tt3.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//Thread.currentThread().setPriority(7);
		tt4.start();
		tt4.setName("Thread 4");
		System.out.println(Thread.currentThread().getName());	
		
		System.out.println("Priority of the thread tt1 is : " + tt1.getPriority());
		System.out.println("Priority of the thread tt2 is : " + tt2.getPriority());
		System.out.println("Priority of the thread tt3 is : " + tt3.getPriority());
		System.out.println("Priority of the thread tt4 is : " + tt4.getPriority());
	}

}
