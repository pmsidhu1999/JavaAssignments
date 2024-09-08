package Test10;

import java.io.*;

public class ReadFromFile2 {
	
public static void main(String[] args) throws Exception {
	
FileReader fis = new FileReader("./xyz.txt");
int c;
while ((c = fis.read()) != -1) {
System.out.print((char) c);
}
fis.close();
}
}