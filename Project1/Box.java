
public class Box {

	//Variables for the box
	private int length, width, height;
	
	// Default Constructor
	public Box() {
		length = 1;
		width = 1;
		height = 1;
	}
	
	/*
	 * A Box constructor 
	 * @param length is the length of the box
	 * @param width is the width of the box
	 * @param height is the height of the box
	 * throws new Illegal Argument Exception will throw an error if once of the params are invalid
	 * 
	 */
	public Box(int length, int width, int height) {
		if(length < 1 || width < 1 || height < 1) {
			throw new IllegalArgumentException("All of the values must be at least 1");
		}
		else {
			this.length = length;
			this.width = width;
			this.height = height;
		}
	}
	
	/*
	 * Method to return the length
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/*
	 * This method sets the length and checks if it is at least one and if not throws an error
	 */
	public void setLength(int length) {
		if(length < 1) {
			throw new IllegalArgumentException("Your length must be greater than 1");
		}
		else {
			this.length = length;
		}
	}

	/*
	 * Method to get the width
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	//This method sets the width and checks if it is at least one and if not throws an error
	public void setWidth(int width) {
		if(width < 1) {
			throw new IllegalArgumentException("Your width must be greater than 1");
		}
		else {
			this.width = width;
		}
	}

	//Method to get the height
	public int getHeight() {
		return height;
	}

	//This method gets the height and checks if it is at least one and if not throws an error
	public void setHeight(int height) {
		if(height < 1) {
			throw new IllegalArgumentException("Your height must be greater than 1");
		}
		else {
			this.height = height;
		}
	}
	
	/*
	 * Method to return volume
	 * @return the Volume
	 */
	public int volume() {
		return length * width * height;
	}
	
	/*
	 * @returns the Box in a string form of length, width and height
	 */
	public String toString() {
		return "L:" + length + " W:" + width + " H:" + height;
	}
	
	/*
	 * This is an Overrided version of the function
	 */
	public boolean equals(Box other) {
		return this.length == other.length && this.width == other.width && this.height == other.width;
	}
	
}
