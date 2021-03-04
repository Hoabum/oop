package chap2_oop;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {  
		      FileWriter myWriter = new FileWriter("D:\\java_oop\\Can_Ban_java\\src\\chap2_oop\\Filename.txt");
		      myWriter.write("Hello ~ Mình Là Hòa Bum");
		      myWriter.close();
		      System.out.println("Done !!!");
		    } catch (IOException e) {
		      System.out.println("An error ");
		      e.printStackTrace();
		    } 
	}

}
