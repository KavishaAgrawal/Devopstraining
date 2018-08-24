package demo.exception;

import java.io.FileInputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoCheckedException {
 public static void main(String[] args) throws ClassNotFoundException {
	try (FileInputStream fi = new FileInputStream("abc.txt");){
		//FileWriter write = new FileWriter("hello.txt");
		//write.write("data.txt");
		
		ObjectInputStream oi = new ObjectInputStream(fi);
//		oi.readObject();
//		fi.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("All Well");
}
}
