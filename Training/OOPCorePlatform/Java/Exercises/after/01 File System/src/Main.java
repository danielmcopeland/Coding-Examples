import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import javax.management.openmbean.OpenMBeanOperationInfoSupport;

public class Main {

	public static void main(String[] args) {
		
		List<String> lines1 = readLines("InputFile1.txt");
		List<String> lines2 = readLines("InputFile2.txt");
		appendLines("OutputFile.txt", lines1);
		appendLines("OutputFile.txt", lines2);
	}
	
	private static List<String> readLines(String inputFile) {
		// TODO: use a BufferedReader to read data from the inputFile and then returns all the lines
		// HINT: did you implement a try-with-resources block to automatically close the reader?
		// HINT: did you implement a catch block?
		List<String> lines = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile))) {
			String currentLine;
			while((currentLine = reader.readLine()) != null) {
				System.out.println("Read line: " + currentLine);
				lines.add(currentLine);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}
	
	private static void appendLines(String outputFile, List<String> lines) {
		// TODO: Use a BufferedWriter to write out all the lines to the output file.
		//       If outputFile does not exist, create it
		//       If outputFile does exist, append it
		// HINT: did you implement a try-with-resources block to automatically close the writer?
		// HINT: did you implement a catch block?
		try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
			for(String currentLine : lines) {
				System.out.println("Writing line: " + currentLine);
				writer.write(currentLine);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
