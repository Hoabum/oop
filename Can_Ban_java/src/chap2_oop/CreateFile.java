package chap2_oop;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("D:\\java_oop\\Can_Ban_java\\src\\chap2_oop\\Filename.txt");
			if(file.createNewFile())
			{
				System.out.println("File created: "+ file.getName());
			}
			else {
				System.out.println("File exists");
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("An err ");
			e.printStackTrace();
		}
	}

}
