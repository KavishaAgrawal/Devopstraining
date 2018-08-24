
public class SleepThread extends Thread{
  @Override
public void run() {
	// TODO Auto-generated method stub
	//super.run();
	  for (int i =0; i<10;i++) {
		  System.out.println("i:"+i);
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  public static void main(String[] args) {
		  
	  }
 	 
}
}
