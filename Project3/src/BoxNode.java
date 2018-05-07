public class BoxNode {
	
	//Instance Variables 
	protected Box data;
	protected BoxNode next;
	
	
	/*
	 * Values for data and next will start as null
	 */
	public BoxNode() {
		
		data = null;
		next = null;
		
	} // Default Constructor
	
	
	/*
	 * @param data: a Box object
	 * Constructor that accepts one parameter, sets the given
	 * box equal to the Box in the class, and then assigns
	 * null to the 'next' BoxNode since there is currently no
	 * box added after
	 */
	public BoxNode(Box data) {
		
		this.data = data;
		next = null;
		
	} // Constructor
	
	
} // BoxNode