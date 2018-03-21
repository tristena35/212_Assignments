import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoxGUI extends JFrame{
	
	//Array to store the array of boxes passed through the constructor
	private ArrayList<Box> boxesForGUI = new ArrayList<Box>();
	
	//These are the TextAreas that will fill the GridLayout
	private JTextArea unsortedArea, sortedArea;

	/*
	 * Default Constructor
	 * @param b is the array provided to the GUI
	 * @param length is the length of the array provided to the GUI
	 */
	public BoxGUI(ArrayList<Box> b) {
		setTitle("BoxGUI");
		setSize(600,300);
		
		//Here we set the array passed in equal to the array of the class BoxGUI
		boxesForGUI = b;
				
		//This line gives the GUI the 'X' button on the top right
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		//Here we call this method I have created to make the GUI fit the necessary requirements 
		arrangeGUI();
		
		setVisible(true);
	}
	
	/*
	 * This method sets up the components of the GUI
	 */
	private void arrangeGUI() {
				
		//Sets the layout of the GUI to be a GridLayout with 1 Row and 2 Columns
		setLayout(new GridLayout(1,2)); 
		
		unsortedArea = new JTextArea();
		
		//This line creates a divider in the middle color black
		unsortedArea.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		//This loop adds the boxes to the text areas
		for(int i = 0; i < boxesForGUI.size(); i++) {
			int volume = boxesForGUI.get(i).getLength() * boxesForGUI.get(i).getWidth() * boxesForGUI.get(i).getHeight();
			unsortedArea.append(boxesForGUI.get(i).toString() + " (VOLUME: " + volume + ")" + "\n");
		}
		
		//This line puts the unsortedArea Text Area into the first part of the GridLayout
		add(unsortedArea);
		
		//Now sort the array for the right side of the GridLayout
		selectionSort(boxesForGUI);
		
		sortedArea = new JTextArea();
		sortedArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		for(int i = 0; i < boxesForGUI.size(); i++) {
			int volume = boxesForGUI.get(i).getLength() * boxesForGUI.get(i).getWidth() * boxesForGUI.get(i).getHeight();
			sortedArea.append(boxesForGUI.get(i).toString() + " (VOLUME: " + volume + ")" + "\n");
		}
		add(sortedArea);
		
		
	}
	
	/**
	 * 
	 * The selectionSort method sorts the array of Boxes based on the volume of each box
	 * 
	 * @param BoxArray is the array of Boxes
	 * @param length is the length of the array
	 * 
	 */
	
	private static void selectionSort(ArrayList<Box> BoxArray) { 

		for ( int i = 0; i < BoxArray.size(); i++ ) { 
			int lowPos = i; 
			for ( int j = i + 1; j < BoxArray.size(); j++ ) 
				if ( BoxArray.get(j).volume() < BoxArray.get(lowPos).volume() ) 
					lowPos = j;
			if ( BoxArray.get(lowPos) != BoxArray.get(i) ) { 
				Box temp = BoxArray.get(lowPos);
				BoxArray.set(lowPos, BoxArray.get(i));
				BoxArray.set(i, temp);
			}
		}
	}
		
}


