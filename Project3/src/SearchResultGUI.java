import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SearchResultGUI extends JFrame{

	//Instance variables for the BoxGUI class
	private SortedBoxList sortedBoxList;
	private int l,w,h;
	private JTextArea sortedArea;		
		
	
	/*
	 * Constructor
	 * @param searchList is the SortedBoxList provided to the GUI
	 */
	public SearchResultGUI(int length, int width, int height) {
				
		/*
		 * Here we pass the list, and set them equal to the class' SortedBoxList
		 */
		sortedBoxList = (SortedBoxList) BoxGUI.sortedBoxList;
		
		//Getting the dimensions
		l=length;
		w=width;
		h=height;
		
		setTitle("Search Box GUI");
		setSize(600,300);
					
		//This line gives the GUI the 'X' button on the top right
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		setLocationRelativeTo(null);
			
		//Here we call this method I have created to make the GUI fit the necessary requirements 
		arrangeGUI();
		//Here we fill the text area with the appropriate boxes
		search();
		
		setVisible(true);
	
	} // Constructor
		
	private void arrangeGUI() {
		
		//Sets the layout of the GUI to be a GridLayout with 1 Row and 2 Columns
		setLayout(new GridLayout(1,1)); 
		
		/*
		 * Here, we set up the unsorted Text Area
		 */
		sortedArea = new JTextArea();
		
		sortedArea.setEditable(false);
		
		//This line creates a divider in the middle color black
		sortedArea.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//This line puts the unsortedArea Text Area into the first part of the GridLayout
		add(sortedArea);
		
	} // arrangeGUI
	
	private void search() {
		
		//Initial Node
		BoxNode node = sortedBoxList.first.next;
		
		while(node != null) {
			
			//Made sure length width and heigh are all greater than the entered length, width and height
			if(node.data.getLength() >= l && node.data.getWidth() >= w && node.data.getHeight() >= h) {
				
				//Adding them to the area
				sortedArea.append(node.data.toString() + "\n");
				
			}
			
			//Go on to the next node
			node = node.next;
			
		}
		
	}
	
}
