package ufc.utils;

import java.awt.event.ActionListener;
import java.io.IOException;

import ufc.gui.WelcomeScreen;

public class Launcher {
	
	
	private static WelcomeScreen welcomeScreen;
	
	// Main method
	public static void main(String[] args) throws IOException {
		executeUFCMAS();
	}
	
	private static void executeUFCMAS() throws IOException {
		
		// Welcome Screen Settings
		welcomeScreen = new WelcomeScreen();
		welcomeScreen.getWelcomeScreenWindowFrame().setVisible(true);
	}
}
