import java.awt.GridLayout;
import java.util.*;

/**
 * 
 * Name: Tristen Aguilar
 * Lab Section: CSCI 212-11G
 *
 */


public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creates the Array to hold the boxes
		//Box[] boxes = new Box[20];
		
		
		ArrayList<Box> boxes = new ArrayList<Box>();
		
		
		//Creates the object of type "TextFileInput" in order to use the Bufferreader property
		TextFileInput file = new TextFileInput("BoxInfo.txt");
		
		String line = file.readLine();
		
		
		//This loop is responsible for going through the text file, until there is nothing left
		while(line != null) {
			
			StringTokenizer thisLine = new StringTokenizer(line, ",");
			
			//These variables use the Tokenizer property to get each of the values 1 by 1 
			int length = Integer.parseInt(thisLine.nextToken());
			int width = Integer.parseInt(thisLine.nextToken());
			int height = Integer.parseInt(thisLine.nextToken());
			
			//Creates a new box with the current values of the line
			Box box = new Box(length,width,height);
			
			//Adds the new Box object to the array holding all Boxes
			//boxes[count] = box;
			
			boxes.add(box);
									
			//This line continues to the next line after the current line has been read
			line = file.readLine();
			
		}
		
		//Make the GUI
		BoxGUI gui = new BoxGUI(boxes);
		
	}

}
