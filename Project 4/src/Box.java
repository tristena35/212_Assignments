public class Box implements Comparable<Box>{

	//Instance Variables for Class Box
	private int length, width, height;
	
	//Constructor
	public Box() {
		
		length = 1;
		width = 1;
		height = 1;
		
	}
	
	/*
	 * Constructor 
	 * @param length of the box
	 * @param width of the box
	 * @param height of the box
	 * 
	 */
	public Box(int length, int width, int height) {
		
		if(length < 1 || width < 1 || height < 1) {
			
			//Throws an exception if once of the given values are less than 1
			throw new IllegalBoxException("All of the values must be at least 1.");
			
		}else {
			
			this.length = length;
			this.width = width;
			this.height = height;
			
		}
		
	}
	
	/*
	 * Getter for length
	 */
	public int getLength() {
		
		return length;
		
	}

	/*
	 * Setter for length, also handles IllegalBoxException
	 */
	public void setLength(int length) {
		
		if(length < 1) {
			
			throw new IllegalBoxException("Your length must be greater than 1.");
			
		}
		
		else {
			
			this.length = length;
			
		}
		
	}

	/*
	 * Getter for Width
	 */
	public int getWidth() {
		
		return width;
	
	}

	//Setter for Width, also handles IllegalBoxException
	public void setWidth(int width) {
		
		if(width < 1) {
			
			throw new IllegalBoxException("Your width must be greater than 1.");
			
		}
		
		else {
			
			this.width = width;
			
		}
		
	}

	//Getter for Height
	public int getHeight() {
		
		return height;
		
	}

	//Setter for Height, also handles IllegalBoxExceptions
	public void setHeight(int height) {
		
		if(height < 1) {
			
			throw new IllegalBoxException("Your height must be greater than 1.");
			
		}
		
		else {
			
			this.height = height;
		
		}
	
	}
	
	/*
	 * Method to find the Volume of a Box
	 */
	public int volume() {
		
		return length * width * height;
		
	}
	
	/*
	 * toString method for a Box
	 */
	public String toString() {
		
		return "L:" + length + " W:" + width + " H:" + height;
		
	}
	
	/*
	 * @Override version of the equals method
	 */
	public boolean equals(Box b) {
		
		return this.length == b.length && this.width == b.width && this.height == b.width;
		
	}
	
	//Overridden version of the Function to Compare two boxes for Order purposes
	@Override
	public int compareTo(Box b) {
		// TODO Auto-generated method stub
		if(this.volume() > b.volume()) {
			
			//If the class volume is bigger than the one being compared to
			return 1;
		
		}
		else if(this.volume() < b.volume()) {
			
			//If the volume being compared to is bigger than the class volume
			return -1;
		
		}
		
		return 0;
		
	}
	
}//Box