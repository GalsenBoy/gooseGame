package job;

import model.Player;
import util.*;

public class App {
	public static void main(String[] args) {

		System.out.println("Veuillez saisir prénom, nom et identifiants dans l'ordre");
		Player player1 = new Player();
		System.out.println(player1);
		Walk w = new Walk();
		w.throwDice(player1);
	}
}
