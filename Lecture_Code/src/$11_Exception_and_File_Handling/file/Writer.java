package $11_Exception_and_File_Handling.file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		String fileName = "java-project.txt";

		// Better to use this (For Java v12 and above)
		// JVM closes "writer" object automatically
		// try (FileWriter writer = new FileWriter(fileName)) {

		try {
			FileWriter writer = new FileWriter(fileName);
			for (int i = 0; i < 35; i++) {
				writer.write("**");
			}
			writer.append("\n\nHi there, ");
			writer.write("This is complete java course ");
			writer.append("created by Prasant Sir.\n\n");
			for (int i = 0; i < 35; i++) {
				writer.write("**");
			}
			writer.flush();
			writer.close();
			System.out.println("File written successfully");
		} catch (IOException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}

}
