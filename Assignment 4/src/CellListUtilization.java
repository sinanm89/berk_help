// -----------------------------------------------------
// Assignment 4
// Question: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CellListUtilization {
	//MAIN
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner sc = null;
		
		System.out.println("Welcome to our program");
	
		
		CellList first_empty = new CellList();
		System.out.println(first_empty.getHead());
		first_empty.addToStart(new CellPhone(0, null, 0, 0));
		System.out.println(first_empty.getHead());
		CellPhone fafa = first_empty.getHead();
		System.out.println(first_empty.getSize());
		
		first_empty.addToStart(new CellPhone(0, null, 0, 0));
		System.out.println(first_empty.getHead());
		
		System.out.println(first_empty.getSize());
//		for (int i=0; i<=first_empty.getSize(); i++) {

//				first_empty
//		}
	
	
		try {
			sc=new Scanner(new FileInputStream("Cell_Info.txt"));
			while(sc.hasNext()) {
//				
//
//				CellPhone mycell =new CellPhone(0, null, 0, 0);
//				
//				CellPhone cloned = mycell.clone();
//				
//						System.out.println(cloned);
				
				
			}
			
		}catch(FileNotFoundException e) {
			
		}
		System.out.print("Enter the serial ID that you wished to searched for");
    	int number = input.nextInt();

		
		sc.close();
		System.out.println("End of our program,have a good day :)");
	}
	

}
