package Streams;

import java.io.*;

public class FileOutputStreamExample {
   
	public static void main(String[] args) throws IOException {
       FileInputStream fis = new FileInputStream("/Users/chamundeswari/Documents/projects/CoreJavaConcepts/src/sample.jpg");
       FileOutputStream fos =new FileOutputStream("/Users/chamundeswari/Documents/projects/CoreJavaConcepts/src/newsample.jpg");
       int data;
       while((data = fis.read())!=-1) {
    	  fos.write(data);
       }
       fis.close();
       fos.close();
	}

}
