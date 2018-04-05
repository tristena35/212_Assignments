public class UnsortedBoxList extends BoxList {
	
	/*
	 * The Default Constructor calls on its parent in order to inherit class variables and functions
	 */
	public UnsortedBoxList() {
		
		super();
		
	}// Default Constructor
	
	
	/*
	 * @param box: Box to be added
	 * For this unsortedBoxList add function, we just add it to the end
	 * regardless of order 
	 */
	public void add(Box box) {
		
		append(box);
		
	} // add

	
} // UnsortedBoxList