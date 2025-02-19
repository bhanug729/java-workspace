package $11_Exception_and_File_Handling.file;

import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		String fileName = "java-project.txt";

		try (FileReader reader = new FileReader(fileName)) {
			
			int read = 0;
			while (read != -1){
				read = reader.read();
				System.out.print((char)read);
			} 
			
		} catch (IOException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}

}
