package main;

import view.WelcomeScreen;

/**
 * This class contains the Main class
 */
public class LoadGame {

	/**
	 * This method is the initial method where the game starts
	 * 
	 * @param args this variable contains the input arguments from command line
	 */
	public static void main(String[] args) {
		WelcomeScreen ws = new WelcomeScreen();
		ws.welcomeGameDisplay();

	}
}
