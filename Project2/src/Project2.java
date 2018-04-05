import java.awt.GridLayout;
import java.util.*;

/**
 * 
 * Name: Tristen Aguilar
 * Lab Section: CSCI 212-11G
 *
 */

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Declaring and Instantiating a SortedBoxList Object
		SortedBoxList sorted = new SortedBoxList();
		
		//Declaring and Instantiating a SortedBoxList Object
		UnsortedBoxList unsorted = new UnsortedBoxList();

		//Creates an Object to help read the provided file
		TextFileInput file = new TextFileInput("BoxInfo.txt");
		
		//This variable will store each line of the text line at one time
		String line = file.readLine();
		
		
		//This loop is responsible for going through the text file, until there is nothing left
		while(line != null) {
			
			//Creates a StringTokenizer object in order to get specific box values
			StringTokenizer thisLine = new StringTokenizer(line, ",");
			
			//These variables use the Tokenizer property to get each of the values 1 by 1 
			int length = Integer.parseInt(thisLine.nextToken());
			int width = Integer.parseInt(thisLine.nextToken());
			int height = Integer.parseInt(thisLine.nextToken());
			
			//Stores the 3 values into a box object and stores the box object in an unsorted list
			unsorted.add(new Box(length,width,height));
			
			//Stores the 3 values into a box object and stores the box object in a sorted list
			sorted.add(new Box(length,width,height));
			
			//Reads the next line
			line = file.readLine();
			
		}
		
		//Make the GUI
		BoxGUI gui = new BoxGUI(sorted,unsorted);
		
	} // main

} // Project2
