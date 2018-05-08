/**
 * 
 */

/**
 * @author trist
 *
 */
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Project4 {
	
	public static void main(String[] args) {
		
		//HashMap that stores the unsorted list
		HashMap<Box,Integer> unsortedBoxList = new HashMap<Box,Integer>();
		//TreeMap that stores the sorted list
		TreeMap<Box,Integer> sortedBoxList = new TreeMap<Box,Integer>();
		
		//Object to read file
		TextFileInput fileInput = new TextFileInput("boxes.txt");
		
		//A variable that will store each line of the text file one by one
		String currentLine = fileInput.readLine();
		
		//Keeps reading through the file until there are no more lines to read
		while(currentLine != null) {
			
			//To determine how to separate each part of the string
			StringTokenizer tokenizer = new StringTokenizer(currentLine,",");
			
			
			/*
			 * Here I use a try and catch in order to make sure all boxes
			 * are valid
			 */
			try {
				
				//Retrieves all values for box
				int length = Integer.parseInt(tokenizer.nextToken(","));
				int width = Integer.parseInt(tokenizer.nextToken(","));
				int height = Integer.parseInt(tokenizer.nextToken(","));
				
				//Gets all the 3 values from the line and stores it in a Box Object
				Box box = new Box(length, width, height);

				//Stores the Box Object in a Map that is unsorted 
				unsortedBoxList.put(box, box.volume());
			
				//Stores the Box Object in a Map that is sorted by volume
				sortedBoxList.put(box, box.volume());

			}catch (IllegalBoxException e) {
				
				System.out.println("Invalid Box.");
				
			}catch(NumberFormatException e) {
				
				System.out.println("Box dimensions must consist of Integers");
				
			}
			
			//Goes to the next line
			currentLine = fileInput.readLine();
		
		}

		//Calls BoxGUI
		BoxGUI gui = new BoxGUI(unsortedBoxList, sortedBoxList);
		
	}

}//Project4