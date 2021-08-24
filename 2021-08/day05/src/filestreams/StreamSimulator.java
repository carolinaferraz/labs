package filestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * most streams in java come from the Java.io package.
 * 
 * they are entities that look at data from a source location
 * and then can produce some output to a target location.
 * generally, when using Streams, you can also change the output of the stream
 * data to a degree using some form of intermediary operations.
 * streams do *not* alter the original source data!
 * 
 */

public class StreamSimulator {
	
	public static void main(String[] args) {
		
		System.out.println("> app starts here : ");
		
		try {
			fosEx();
			fisEx();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("> app ends here ");
	}
	
//	using FileOutputStream
	public static void fosEx()  throws IOException {
		FileOutputStream fos = new FileOutputStream("files/hello-fos.txt");
		
		for(char letter = 'a'; letter <= 'z'; letter++) {
			fos.write(letter);
			}
		
//	close stream w/ quick check
		if(fos != null)
			fos.close();
		}
	
	
//	using FileInputStream
	public static void fisEx() throws IOException {
		FileInputStream fis = new FileInputStream("files/hello.txt");

//	input is a representation for the data read from file
		byte input;
		
//	not casting fis to (byte) would return an int / error
		while ((input = (byte)fis.read()) != -1) {
			
			System.out.print((char)input + " ");
		}
		System.out.print("\n");
		
//	always close streams, they're resource-intensive
		if(fis != null)
			fis.close();
		}
}