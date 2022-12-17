package job;

import java.util.ArrayList;
import model.Player;
import util.*;

public class App {
	public static void main(String[] args) {
		ArrayList<Player> pl = new ArrayList<Player>();
		System.out.println("Veuillez saisir vos coordonées");
		Player player1 = new Player();
		pl.add(player1);

		System.out.println(player1);

		Walk w = new Walk();
		w.throwDice(player1);
	}
}
