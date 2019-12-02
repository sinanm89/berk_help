// -----------------------------------------------------
// Assignment 4
// Question: Part 1
// Written by: Berk Bozok 40038674
// -----------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
Berk BOZOK 40038674
COMP249
Assignment #4
Due Date  Monday, December 2nd, 2019 at 10:00 AM
*/
public class Part1Dictionary {
	public static void main(String[] args) {
		/**
		 * creating an array list and opening scanners and printwriters
		 */
	ArrayList<String > dictionary = new ArrayList<String >();
	Scanner sc= null;
	PrintWriter pw= null;
	String s; 
	/**
	 * taking the user input to open the file which user asked for 
	 */
	System.out.println("Welcome to our dictionary sorting program :)");
		Scanner user = new Scanner(System.in);
		System.out.println("Enter the name of the file to open please"); 
		s = user.nextLine();
	try {
		/**
		 * trying to read from our file first then making special cases for specific characters
		 * and then we are trying to get each word on the file
		 * after this operation or objective is to sort them and separete with them as their respected first character
		 */
		sc=new Scanner(new FileInputStream(s));
		pw=new PrintWriter(new FileOutputStream("SubDictionary.txt"));
		String searched;
		
		while(sc.hasNext()) {
			searched =sc.next().toUpperCase();
			/**
			 * finding specific cases which we do not want to see those and delete them if the word contains at the end
			 */
		if(searched.contains("?") || searched.contains(":") || searched.contains(",") || searched.contains("=") || searched.contains(";") || searched.contains("!") || searched.contains(".")) {
			searched=searched.substring(0,searched.length()-1);
		}
		if(searched.contains("’") ) {
			searched=searched.substring(0,searched.length()-2);
		}
		if(searched.contains("0") || searched.contains("1") || searched.contains("2") || searched.contains("3") || searched.contains("4") || searched.contains("5") || searched.contains("6") || searched.contains("7") || searched.contains("8") || searched.contains("9") ) {
			searched= "";
		}
		if(searched.length()==1 && !searched.equals("A") && !searched.equals("I")) {
			searched="";
		}
		if(!dictionary.contains(searched) && !searched.equals("")) {
			dictionary.add(searched);
		}
		searched=searched.substring(0);	
	
		}
		/**
		 * making a catch case if the file is not there
		 */
	   }catch(FileNotFoundException e) {
		System.out.println("Sorry File not found, system closing..");
		System.exit(0);
	}
	/**
	 * sorting and printing their respected first characters
	*/
	Collections.sort(dictionary);
	//System.out.println("This text file has "+dictionary.size()+" entries");
	pw.println("This text file has "+dictionary.size()+" entries");
	/**
	 * printing out the first letter of the respected word and writing == below
	 */
    char this_character ;
    this_character = dictionary.get(0).charAt(0);
   // System.out.println(this_character+"\n==");
    pw.println(this_character+"\n==");
   // System.out.println(dictionary.get(0));
    pw.println(dictionary.get(0));
    
    //The reason i did not comment it out is to demonstrate easier in the demo as a printout 
    /**
     * looping through the entire text file until there is no next line to print our dictionary
     */
    for(int i =1;i<dictionary.size();i++) {
        
        if(this_character == (dictionary.get(i).charAt(0))) {
        	//System.out.println(dictionary.get(i));
        	pw.println(dictionary.get(i));
        	
        }
        /**
         * if there is a repetition just print out the letter once to avoid duplicate letters
         */
        else {
        	this_character=dictionary.get(i).charAt(0);
        	
        	//System.out.println("\n"+this_character+"\n==");
        	pw.println("\n"+this_character+"\n==");
        	//System.out.println(dictionary.get(i));
        	pw.println(dictionary.get(i));
        }


    }
    /**
     * closing our scanners and printwriters
     */
	pw.close();
	sc.close();
	System.out.println(s+" file has opened and output file created to see the result");
		}
	}