import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {
 public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   try {
	System.out.println("Please enter your name");
	   String Name = br.readLine();
	   System.out.println("you entered:"+Name);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
}
}
