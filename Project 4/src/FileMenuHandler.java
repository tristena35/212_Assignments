import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class FileMenuHandler implements ActionListener{

	/*
	 * Java method to check if an event occured
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String MenuItem = e.getActionCommand();
		String enteredBox;
		
		/*
		 * If Search is clicked, should prompt the user to enter box dimensions
		 */
		if(MenuItem.equals("Search")) {
			
			/*
			 * Use a Try and Catch to check if the user entered a box's dimensions correctly
			 */
			try {
				
				enteredBox =JOptionPane.showInputDialog(null, "Enter a length, width, height.");
				
				StringTokenizer tokenizer = new StringTokenizer(enteredBox,",");
				
				int length = Integer.parseInt(tokenizer.nextToken(","));
				int width = Integer.parseInt(tokenizer.nextToken(","));
				int height = Integer.parseInt(tokenizer.nextToken(","));
					
				//Calls SearchGUI
				SearchResultGUI gui = new SearchResultGUI(length, width, height);
			
			}catch(NumberFormatException ne) {
				
				JOptionPane.showMessageDialog(null, "Enter a correct box i.e '1,2,3' ");
				 
			}
			
		}
			
	}
		
}//FileMenuHandler