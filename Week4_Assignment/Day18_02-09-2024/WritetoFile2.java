package Test10;

import java.io.*;


public class WritetoFile2 {
public static void main(String [] args) throws IOException {
	FileWriter fos = new FileWriter("./xyz.txt", true);
		String msg="Hello, How are you";
	
	fos.write(msg);
	fos.close();
}
}
