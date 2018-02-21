package HubbmBazaar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	/**
	 * The HUBBMBazaar program taking input files; user.txt, item.txt,
	 * commands.txt. Those text files must be in the same directory with 
	 * src of the code. 
	 */
	/**
	 * This is the main method of the program. That is reading text files
	 * and calling Write and Read methods with splitted lines as parameters 
	 * which has read.
	 * @author Onur Tolga KESEMEN
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {
		try {
			FileWriter writer = new FileWriter("output.txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			ReadWrite r = new ReadWrite();
			Scanner scanner = new Scanner(new File("users.txt"));
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				String[] words = line.split("\t");
				r.Read(words);
				}
			scanner = new Scanner(new File("item.txt"));
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				String[] words = line.split("\t");
				r.Read(words);		
			}
			scanner = new Scanner(new File("commands.txt"));
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				buffer.write("COMMAND TEXT: <" + line + ">");
				buffer.write("\n");
				String[] words = line.split("\t");
				r.Write(words,buffer);
				buffer.write("\n");
			}
			scanner.close();
			buffer.close();
			} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
			}
	}

}
