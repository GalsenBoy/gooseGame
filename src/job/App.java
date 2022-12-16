package metier;

import java.util.ArrayList;
import model.Player;
import util.*;

public class App {

	public static void main(String[] args) {
	
		ArrayList<Player> pl = new ArrayList<Player>();
		System.out.println("Veuillez saisir vos coordonées");
		Player player1 = new Player();		
		
		int randomNumber = RandomDice.getRandomNumber();
		System.out.println(randomNumber);
		System.out.println(player1);
	}
}
