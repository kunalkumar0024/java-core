package multiThreading;

public class CreateThread implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			try {
			System.out.println(i);
			Thread.sleep(1000);
		}catch(Exception e) {
				e.printStackTrace();
		}
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread t=new CreateThread();
		Thread thread=new Thread(t);
		thread.start();
		String str=thread.getName();
		System.out.println(str);

		long id=thread.getId();
		System.out.println(id);
	}
	

}
