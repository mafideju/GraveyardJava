package org.mafideju.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingFiles {

	public static void main(String... args) throws IOException {

		Path path = Path.of("files/poems.txt");
		
		BufferedWriter writer = Files.newBufferedWriter(path);
		
		writer.write("Hoje eh segunda feira e decretamos feriado");
		writer.write("Chamei Dom Paulo Coelho e saimos lado a lado...");
		System.out.println("Rodou");
		writer.flush();
		writer.close();
	}

}