package multiThreading;


class ThreadPri extends Thread{
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
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPri t1=new ThreadPri();
		ThreadPri t2=new ThreadPri();
		ThreadPri t3=new ThreadPri();
		ThreadPri t4=new ThreadPri();
		t1.setName("Thread 1");
		t1.start();
		
		try { 
			System.out.println(Thread.currentThread().getName());
			t1.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		t2.setName("Thread 2");
		t2.start();
		
		try { 
			System.out.println(Thread.currentThread().getName());
			t2.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		t3.setPriority(9);
		t3.setName("Thread 3");
		t3.start();
		  
		
		try { 
			System.out.println(Thread.currentThread().getName());
		  // t3.join();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//Thread.currentThread().setPriority(7);
		t4.setName("Thread 4");
		t4.start();
		
		System.out.println(Thread.currentThread().getName());	
		
		System.out.println("Priority of the thread tt1 is : " + t1.getPriority());
		System.out.println("Priority of the thread tt2 is : " + t2.getPriority());
		System.out.println("Priority of the thread tt3 is : " + t3.getPriority());
		System.out.println("Priority of the thread tt4 is : " + t4.getPriority());



	}

}
