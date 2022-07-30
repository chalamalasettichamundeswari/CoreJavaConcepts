package Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
      // FileInputStream fis = new FileInputStream(new File("/Users/chamundeswari/Documents/projects/CoreJavaConcepts/src/sample.txt"));
		FileReader fis = new FileReader("/Users/chamundeswari/Documents/projects/CoreJavaConcepts/src/sample.txt");
        BufferedReader br = new BufferedReader(fis);
//       int i;
//       while((i=fis.read())!=-1) {
//    	   System.out.print((char)i);
//       }
       String line;
       int count=0;
       while((line=br.readLine())!=null) {
    	   StringTokenizer st = new StringTokenizer(line,",!@%");
    	   while(st.hasMoreTokens()) {
    		   System.out.println(st.nextToken());
    		   count++;
    	   }
    	   
       }
      System.out.println("count of lines: "+count);
      fis.close();
      System.out.println("\nfile closed");
	}

}
//Streams is a Application/Program which we can read data from a input source or write data to a output source.
//Types:Byte,Character,BufferedStreams,ObjectStreams
//ByteStreams-read write one byte at a time.
//CharacterStreams-uses unicode read and write one character at a time.
//BufferedStreams-for reading more data
//objectStreams- writing objects to a file system or to a network called serialization. reading objects from a file system or to a network called de-serialization
//Streams there in java.io package
//ByteStreams - Classes are InputStream,OutputStream,FileInputStream,FileOutputStream
//CharacterStreams -Classes are FileReader,FileWriter