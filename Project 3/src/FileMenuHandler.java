import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
public class FileMenuHandler implements ActionListener {
   BoxGUI boxGui;
   SortedBoxList list;
   SortedBoxList filteredList;
   
   public FileMenuHandler (BoxGUI jf) {
      boxGui = jf;
   }
   
   public void actionPerformed(ActionEvent event) {
	  
	   /*
	    * Added a try and catch because when passing the values into the search box,
	    * there may be an illegal value passed
	    */
	   try {
		   
		  String input = JOptionPane.showInputDialog("Search for box"); 
		  //Creates a StringTokenizer object in order to get specific box values
		  StringTokenizer thisLine = new StringTokenizer(input, ",");
			
		  //These variables use the Tokenizer property to get each of the values 1 by 1 
		  int length = Integer.parseInt(thisLine.nextToken());
		  int width = Integer.parseInt(thisLine.nextToken());
		  int height = Integer.parseInt(thisLine.nextToken());
		  
		  //Volumes
		  int volume = length * width * height;
		  
	      String menuName;
	      menuName = event.getActionCommand();
	      
	      //do action for Search
	      if (menuName.equals("Search")) {
	      
	    	  //list = search(boxGui.getSortedBoxList(),volume); 
	    	  SearchResultGUI searchGUI = new SearchResultGUI(length,width,height);
	      
	      }else if (menuName.equals("Quit"))
	          System.exit(0);
      
	   }
	   catch(NumberFormatException e) {
		   
		   JOptionPane.showMessageDialog(null, "Invalid Box Input");
		   
	   }
      
   } //actionPerformed
      
    /*
     * search Function
     * @param list is the BoxList
     * @param volume is the value which is retrieved from the about messageInputDialog
     */
    public SortedBoxList search(BoxList list, int volume) {
    	
    	SortedBoxList returnList = new SortedBoxList();
    	
    	//A Node that gets the next node
    	BoxNode temp = list.first.next;
    				
    	//A loop to go through the nodes until it reaches null
    	while(temp != null) {
    				
	    	//Gets all boxes that have volumes that hold the volume provided
	    	if(temp.data.volume() >= volume) {
	    	
	    		//Creates a new qualified box, and adds it to the list
	    		Box box = new Box(temp.data.getLength(),temp.data.getWidth(),temp.data.getHeight());
	    		returnList.add(box);
	    	
	    	}
	    	
	    //Go to the next BoxNode	
	    temp = temp.next;	
	    
    	}
    	
    	return returnList;
    			
    }
    
    
}