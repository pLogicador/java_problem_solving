package app;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name? ");
		
		String message = String.format("Welcome, %s, To New World!", name);
		JOptionPane.showMessageDialog(null, message);

	}

}
