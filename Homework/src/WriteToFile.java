import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
		FileWriter myWriter= new FileWriter("OurFile.txt");
		myWriter.write("1_ Nasser Alharthy. 2_ Abdullah Alshehri. 3_ Mosfer Hussein. 4_  Majed Abdullah. 5_ Bandar Al Shreya. 6_ Hussain Alyami.");
		
		myWriter.close();
		System.out.println("Successfully wrote to the file");
		}catch(IOException e) { 
			System.out.println("An error happend");
			e.printStackTrace();
		}
	}

}
