import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import javax.xml.crypto.KeySelectorException;

public class Main {

	public static void main(String[] args) {
		
		List<String> lines1 = readQuick("InputFile1.txt");
		List<String> lines2 = readQuick("InputFile2.txt");
		appendLines("OutputFile.txt", lines1);
		appendLines("OutputFile.txt", lines2);
	}

	private static List<String> readQuick(String inputFile) {
		List<String> lines = new List<String>() {
			@Override
			public int size() {
				return 0;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public boolean contains(Object o) {
				return false;
			}

			@Override
			public Iterator<String> iterator() {
				return null;
			}

			@Override
			public Object[] toArray() {
				return new Object[0];
			}

			@Override
			public <T> T[] toArray(T[] a) {
				return null;
			}

			@Override
			public boolean add(String s) {
				return false;
			}

			@Override
			public boolean remove(Object o) {
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends String> c) {
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends String> c) {
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				return false;
			}

			@Override
			public void clear() {

			}

			@Override
			public String get(int index) {
				return null;
			}

			@Override
			public String set(int index, String element) {
				return null;
			}

			@Override
			public void add(int index, String element) {

			}

			@Override
			public String remove(int index) {
				return null;
			}

			@Override
			public int indexOf(Object o) {
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				return 0;
			}

			@Override
			public ListIterator<String> listIterator() {
				return null;
			}

			@Override
			public ListIterator<String> listIterator(int index) {
				return null;
			}

			@Override
			public List<String> subList(int fromIndex, int toIndex) {
				return null;
			}
		};

		try{
			 lines = Files.readAllLines(Paths.get(inputFile));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	private static List<String> readLines(String inputFile) {
		// TODO: use a BufferedReader to read data from the inputFile and then returns all the lines
		// HINT: did you implement a try-with-resources block to automatically close the reader?
		// HINT: did you implement a catch block?
		//List<String> lines = new ArrayList<>();
		List<String> lines = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Reading line:" + line);
				lines.add(line);
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
		for (String line:lines) {
			System.out.println("-"+line);
		}
		try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
			for (String line:lines) {
				writer.write(line);
				writer.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
