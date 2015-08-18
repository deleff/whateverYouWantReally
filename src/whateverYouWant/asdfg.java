package whateverYouWant;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class asdfg extends JFrame implements ActionListener {
	JFrame converterFrame;

	JPanel converterPanel;

	JTextField nameField;

	JLabel enterName, greeterLabel;

	JButton submitBTN;

	// Constructor
	public asdfg() {

		converterFrame = new JFrame("Greeter");
		converterFrame.setLocation(800, 400);
		converterPanel = new JPanel();
		converterPanel.setLayout(new GridLayout(5, 1));

		// Add the widgets.
		addWidgets();

		// Add the panel to the frame.
		converterFrame.getContentPane()
				.add(converterPanel, BorderLayout.CENTER);

		// Exit when the window is closed.
		converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Show the converter.
		converterFrame.pack();
		converterFrame.setVisible(true);
	}

	// Create and add the widgets for converter.
	private void addWidgets() {
		// Create widgets.

		ImageIcon icon = new ImageIcon("images/convert.gif",
				"Convert temperature");
		nameField = new JTextField(2);
		enterName = new JLabel("Please enter your name:", SwingConstants.LEFT);
		submitBTN = new JButton("Submit", icon);
		submitBTN.setPreferredSize(new Dimension(10, 10));

		greeterLabel = new JLabel("", SwingConstants.LEFT);

		enterName.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 200));
		greeterLabel.setBorder(BorderFactory.createEmptyBorder(50, 5, 5, 5));

		// Listen to events from Convert button.
		submitBTN.addActionListener(this);

		// Add widgets to container.
		converterPanel.add(enterName);
		converterPanel.add(nameField);
		converterPanel.add(submitBTN);
		converterPanel.add(greeterLabel);
	}

	// Implementation of ActionListener interface.
	public void actionPerformed(ActionEvent event) {
		// Get the entered name
		String name = (String) (nameField.getText());

		// Greet the user

		if (name.length() >= 20) {
			greeterLabel.setText("That is one long name.");
		} 
		else if (name.equals("")) {
			greeterLabel.setText("Mate, please enter your name.");
		} 
		
		else {
			greeterLabel.setText("Hello " + name + ", nice to meet you.");
		}
	}

	// main method
	public static void main(String[] args) {
		// set the look and feel
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		}

		asdfg converter = new asdfg();

	}
}