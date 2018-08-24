
public class MyThread extends Thread {
	  
		 private int data;

		public MyThread(int data) {
			super();
			this.data = data;
		}
			
  @Override
public void run() {
	// TODO Auto-generated method stub
	//super.run();
	  System.out.println("Thread started"+Thread.currentThread().getName());
	  System.out.println("Hello");
}
}
