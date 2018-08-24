class MyThread2 extends Thread {
      MyThread2() {
                 System.out.print("MyThread ");
       }

       public void run() {
               System.out.print("bar ");
        }

        public void run(String s) {
                 System.out.print("baz ");
        }
}

public class MyThread1 {
          public static void main (String [] args) {
               Thread t = new MyThread2() { 
                      public void run() {
                             System.out.print("foo ");
                       }
                };
                t.start();
           }
}