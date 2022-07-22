package javaprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsIntextFile {
	
	public static void main(String[] args) throws IOException {
		
		  String line;  
	        int count = 0;
	
        FileReader file = new FileReader("one.txt "); 
        BufferedReader br = new BufferedReader(file);  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length; 
            }

        System.out.println("Number of words present in given file: " + count);  
        br.close(); 
	
	}

}
