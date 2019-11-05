package view;

import java.util.ArrayList;

import model.Observable;
import model.Player;
import model.PlayersList;

public class CardExchangeView implements Observer {

	public void update(Observable obs,Object x) {
		showMessage((PlayersList) obs,(Player) x);
	}
	
	private void showMessage(PlayersList pl,Player p) {
		int count=1;
		if(p.getGameState().equals("REINFORCE")) {
			ArrayList<String> cardList=pl.getListOfPlayers().get(p.getCurrentPlayerTurn()).getCurrentCardList();
			System.out.println("\nCard Exchange View");
			for (int dashes = 0; dashes < 90; dashes++) {
				System.out.print("_");
			}
			System.out.println();
			for(String s:cardList) {
				System.out.println(count+". "+s);
				count++;
			}
		}
	}
}
