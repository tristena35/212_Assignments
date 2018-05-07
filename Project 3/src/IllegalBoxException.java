/*
 * This class is called for specific exceptions relating to the box dimensions
 */
public class IllegalBoxException extends IllegalArgumentException{
	
	public IllegalBoxException(String message) {
		/*
		 * The super call refers to the IllegalArgumentException 
		 * class, which is why we provide a string to display 
		 * the error
		 */
		super(message);
	}

}
