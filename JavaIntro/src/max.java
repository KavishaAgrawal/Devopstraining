import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max {
 public static void main(String[] args) {
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.println("enter two numbers");
		int value1 = Integer.parseInt(br1.readLine());
		int value2 = Integer.parseInt(br2.readLine());
		System.out.println("you entered:"+value1+ "\t" +value2);
		if(value1>value2) {
			System.out.println("greater number is"+value1);
		}
		else {
			System.out.println("greater number is"+value2);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
