public class SortedBoxList extends BoxList {
	
	/*
	 * Default Constructor that calls on the parent class
	 * in order to use information from it
	 */
	public SortedBoxList() {
		
		super();
		
	} // Default Constructor
	
	
	/*
	 * Adds a BoxNode to the list and will put the node in the correct
	 * position. The list is sorted from lowest to highest based on the Box's 
	 * volume
	 * @param b a Box object with a length, width, and height
	 */
	public void add(Box b) {
					
		//A Node that gets the next node
		BoxNode next = first.next;
			
		//A Node that gets the before node
		BoxNode start = first;
		
		//Temporary Node
		BoxNode temp = new BoxNode(b);
			
		//A loop to go through the nodes until it reaches null
		while(next != null) {
			
			//Exit the loop if the Node has a greater volume than the next
			if(next.data.volume() > temp.data.volume())
				break;
				
			//Change the starting node to the next
			start = next;
			//Keep track of the value of the previous node
			next = next.next;
			
		}
			
		//Add the new BoxNode
		start.next = temp;
		temp.next = next;
		
	} // add
	
} // SortedBoxList