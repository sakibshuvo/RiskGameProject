package view;

import model.Observable;
import model.Player;

public class PhaseView implements Observer {

	public void update(Observable obs) {
		showMessage((Player) obs);
	}

	private void showMessage(Player p) {
		System.out.println("\nPhase View");
		for (int dashes = 0; dashes < 90; dashes++)
			System.out.print("_");		
		System.out.println("\nGame State: "+p.getGameState());
		System.out.println("\nCurrent Player Name: "+p.getCurrentPlayerTurn());
		System.out.println("\nActions Performed:");
		System.out.println("\n"+p.getActionsPerformed());
	}
}