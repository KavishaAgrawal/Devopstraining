import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {
public static void main(String[] args) {
	try {
		FileWriter filewr = new FileWriter("abc.txt",true);
	    filewr.write("City,Pune");
	    System.out.println("File created and data inserted");
	  filewr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
