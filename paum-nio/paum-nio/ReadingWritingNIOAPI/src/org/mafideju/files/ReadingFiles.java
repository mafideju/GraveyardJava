package org.mafideju.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
//import sun.nio.cs.StandardCharsets;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("files/file.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
			
			String line = reader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
			
		};
		
	}

}