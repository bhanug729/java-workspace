package $11_Exception_and_File_Handling.file;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
	public static void main(String[] args) {
		String fileName = "java-course.txt";

		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write("This is the best Java course.\n");
			for (int i = 0; i < 40; i++) {
				writer.write('*');
			}

			writer.flush();
			System.out.println("File Written Successfully");
		} catch (IOException exception) {
			System.out.printf("Exception occurred %s\n", exception.getMessage());
		}
	}
}
