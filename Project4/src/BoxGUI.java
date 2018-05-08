import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class BoxGUI extends JFrame {
	
	//Instance variables for class BoxGUI
	private FileMenuHandler fmh;
	
	private JTextArea unsortedArea,sortedArea;
	
	private JMenuBar menuBar;
	private JMenu toolsMenu;
	private JMenuItem searchItem;
	
	//HashMap, order will not matter
	protected static HashMap<Box,Integer> unsortedList;
	
	//TreeMap, order will matter
	protected static TreeMap<Box,Integer> sortedList;
	
	/*
	 * Default Constructor
	 * @param HashmMap to pass unsortedList
	 * @param TreeMap to pass sortedList
	 */
	public BoxGUI(HashMap unsortedList ,TreeMap sortedList) {
		
		//Assigning class variables to passed arguments
		this.unsortedList = unsortedList;
		this.sortedList = sortedList;
		
		fmh = new FileMenuHandler();
		
		setTitle("Project 4 BoxGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,350);
		setLocationRelativeTo(null);
		
		//Here we put the GUI together
		arrangeGUI();
		
		setVisible(true);
		
	}
	
	//Arrange all components of the GUI
	private void arrangeGUI() {
		
		setLayout(new GridLayout(1,2));

		//Setting up the Menu
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		toolsMenu = new JMenu("Tools");
		menuBar.add(toolsMenu);
		
		searchItem = new JMenuItem("Search");
		searchItem.addActionListener(fmh);
		toolsMenu.add(searchItem);
		
		//LEFT SIDE
		unsortedArea = new JTextArea();
		unsortedArea.setEditable(false);
		unsortedArea.setBorder(BorderFactory.createLineBorder(Color.black));
		
		for(Box b : unsortedList.keySet()) {
			
			unsortedArea.append(b.toString() + "\n");
		
		}

		//Adds the unsortedArea to the Left-Hand side of the GridLayout
		add(unsortedArea);
		
		//RIGHT SIDE
		sortedArea = new JTextArea();
		sortedArea.setEditable(false);
		sortedArea.setBorder(BorderFactory.createLineBorder(Color.black));
		
		for(Box b : sortedList.keySet()) {
			
			sortedArea.append(b.toString() + "\n");
			
		}
		
		//Adds the unsortedArea to the Right-Hand side of the GridLayout
		add(sortedArea);
	
	}
	
}//BoxGUI