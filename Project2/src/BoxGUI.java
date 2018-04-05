import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoxGUI extends JFrame{
	
	//Instance variables for the BoxGUI class
	private BoxList unsortedBoxList, sortedBoxList;
	private JTextArea sortedArea, unsortedArea;		

	
	/*
	 * Constructor
	 * @param sorted is the BoxList provided to the GUI
	 * @param unsorted is the also BoxList provided to the GUI
	 */
	public BoxGUI(BoxList sorted ,BoxList unsorted) {
			
		/*
		 * Here we pass the two lists, and set them equal to the classes BoxList objects
		 */
		unsortedBoxList = unsorted;
		sortedBoxList = sorted;
		
		setTitle("BoxGUI BoxList");
		setSize(600,300);
				
		//This line gives the GUI the 'X' button on the top right
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		//Here we call this method I have created to make the GUI fit the necessary requirements 
		arrangeGUI();
		
		setVisible(true);
	} // Constructor
	
	
	/*
	 * This method sets up the components of the GUI
	 */
	private void arrangeGUI() {
				
		//Sets the layout of the GUI to be a GridLayout with 1 Row and 2 Columns
		setLayout(new GridLayout(1,2)); 
		
		/*
		 * Here, we set up the unsorted Text Area
		 */
		unsortedArea = new JTextArea();
		unsortedArea.setEditable(false);
		//This line creates a divider in the middle color black
		unsortedArea.setBorder(BorderFactory.createLineBorder(Color.black));
		//Here we add the unsorted list to its appropriate field
		unsortedArea.append(unsortedBoxList.toString());
		//This line puts the unsortedArea Text Area into the first part of the GridLayout
		add(unsortedArea);
		
		
		/*
		 * Here, we set up the sorted Text Area
		 */
		sortedArea = new JTextArea();
		sortedArea.setEditable(false);
		sortedArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sortedArea.append(sortedBoxList.toString());
		add(sortedArea);
		
	} // arrangeGUI
		
} // BoxGUI


