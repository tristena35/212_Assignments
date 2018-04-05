/**
 * Name: Tristen Aguilar
 * Lab Section: 212-11G
 */
package project0;/*

 CSCI 212-11G
 LAB (22980)
 */

import javax.swing.*;

public class projectZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String inputSentence;
		boolean isRunning = true; // Is running is used to keep the while loop running.

		while (isRunning) {
			// This line asks the user for input by popping out a single window with a text input
			inputSentence = JOptionPane.showInputDialog(null, "Please enter a sentence."); // showInputDialog is a default type of JOptionPane
			
			// This line is responsible for checking if the user enters stop, and exits the program if so
			if (inputSentence.equalsIgnoreCase("STOP")) {
				isRunning = false; // 'isRunning' is set to false in order to terminate the while loop
				System.exit(0);
			}
			
			// Create to counters to keep track of the upper and lower case e's
			int counte = 0, countE = 0;
			// This loop goes through every character in the sentence 
			for(int i = 0; i < inputSentence.length(); i++) {
				if(inputSentence.charAt(i) == 'e') // This if statement checks if current character is equal to lower case e
					counte ++;
				else if(inputSentence.charAt(i) == 'E') // This if statement checks if current character is equal to upper case e
					countE ++;
			}
			
			// This line Displays the number of upper and lower case e's
			JOptionPane.showMessageDialog(null, "Number of uppercase e's: " + countE + "\n" + "Number of lowercase e's: " + counte);

		}

	} // Main
}
