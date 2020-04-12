import java.io.File;
import java.io.IOException;

public class Homework {

	public static void main(String[]args) {
		File myObj= new File("OurFile.txt");
		try {
		if(myObj.createNewFile()) {
		System.out.println("File Created Successfully"+myObj.getName());
		
		}else {
		    System.out.println("File Already Exists.");
		    System.out.println("The file located at "+myObj.toURI());
		}
		
		}catch(IOException e) {
		
		System.out.println("An error happend");
		e.printStackTrace();
		

	
	}
}
}