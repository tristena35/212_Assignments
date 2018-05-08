import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.StringTokenizer;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SearchResultGUI extends JFrame {
	
	//Instance variables for class ResultsGUI
	private int length, width, height;
	
	private JTextArea sortedArea;
	
	/*
	 * Default Constructor
	 * @param length searched
	 * @param width searched
	 * @param height searched
	 */
	public SearchResultGUI(int length, int width, int height) {
		
		//Assigning the class variables to the passed arguments
		this.length = length;
		this.width = width;
		this.height = height;
		
		setTitle("Search Results");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,350);
		setLocationRelativeTo(null);
		
		//This functions gathers all components necessary for the GUI
		arrangeGUI();

		/*
		 * The loop below goes through all boxes and adds the ones that meet the requirements to the TextArea
		 */
		for(Box box: BoxGUI.sortedList.keySet()) {
			
			if(box.getLength() >= length && box.getWidth() >= width && box.getHeight() >= height) {
				
				sortedArea.append(box.toString() + "\n");
			
			}
		
		}
		
		setVisible(true);
		
	}
	
	//Method to set up GUI
	private void arrangeGUI() {
		
		setLayout(new GridLayout(1,1));
		
		sortedArea = new JTextArea();
		sortedArea.setEditable(false);
		sortedArea.setBorder(BorderFactory.createLineBorder(Color.black));
	
		//Putting the TextArea to the GUI
		add(sortedArea);
	
	}

}//SearchResultGUI