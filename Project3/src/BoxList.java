public abstract class BoxList {
	
	//Instance Variables
	protected BoxNode head;	
	protected BoxNode first; 
	protected BoxNode last; 
   	protected int length;
   
   	
   	/*
   	 * Default Constructor
   	 * Makes an empty list
   	 * first and last start equal to null
   	 */
   	public BoxList() {
   		
   		head = new BoxNode();
   		first = head;
   		last = head;
   		length = 0;
   		
   	} // constructor
   
   	
   	/*
   	 * append is responsible for adding more Boxes to the BoxList
   	 * @param box: The received box will be added to the list
   	 */
   	public void append (Box box) {
   		
   		BoxNode newNode = new BoxNode(box);
   		
   		last.next = newNode;
   		last = newNode;
   		length++;
   		
   	} // append
   
   	
   	/*
   	 * (non-Javadoc)
   	 * @see java.lang.Object#toString()
   	 * 
   	 * This function returns the created BoxList in the form of a String
   	 * In order for it to be readable
   	 */
   	public String toString() {
   		
		BoxNode findingEnd = first.next;
		String theBoxlist = "";
		
		/*
		 * This While loop will continue to run and add Boxes to the list
		 * until the findingEnd BoxNode returns node, or in other words
		 * when there are no more boxes
		 */
		while(findingEnd != null) {
			
			Box temp = findingEnd.data;
			
			theBoxlist += (temp).toString();
			theBoxlist += "\n";
			
			/*
			 * Once the current BoxNode has been recorded,
			 * the set the current value of it to the next Node
			 * in order to record the next Box
			 */
			findingEnd = findingEnd.next;
			
		}
		
		return theBoxlist;
		
	}//toString	 

} // BoxList