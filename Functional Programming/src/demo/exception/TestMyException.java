package demo.exception;

public class TestMyException {
  public static void main(String[] args) {
	int age=18;
	
	if(age<18) {
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
  }
