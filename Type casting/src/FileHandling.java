


import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException; 
import java.io.PrintWriter; 

public class FileHandling{ 
	public static void main(String args[]) throws IOException {
		
		FileWriter fw = null; 
		BufferedWriter bw = null;
		PrintWriter pw = null;

     try {
    	 
    	 fw = new FileWriter("names.txt", true);
    	 bw = new BufferedWriter(fw); 
    	 pw = new PrintWriter(bw);
    	 
         pw.println("aravind");
         pw.println("babu");
         pw.println("murugan");
         
         System.out.println("Information Successfully appended into file"); 
         pw.flush(); }
     finally { 
    	 try {
    		 pw.close();
    		 bw.close(); 
    		 fw.close(); } 
    	 catch (IOException io) {
    	 }
     }
    		 try (FileWriter f = new FileWriter("names.txt", true);
    				 BufferedWriter b = new BufferedWriter(f);
    				 PrintWriter p = new PrintWriter(b);) { 
    			 
    			 p.println("appending text into file"); 
    			 p.println("jai"); 
    			 p.println("selva"); } 
    		 
    		 catch (IOException i) { 
    			 i.printStackTrace(); 
    		 }
    		  		 		 
    	 } 
    	 }