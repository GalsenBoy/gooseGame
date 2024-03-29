package util;

import model.*;

//Déclaration et initialisation des mes variables
public class Play {
	int arrived;
	int exceed;
	int target = Constants.TARGET;
	int departure = Constants.DEPARTURE;
	int count = Constants.MIN;
	int cast = RandomDice.getRandomNumber();

	// Affichage de la position de départ du joueur
	public void initPosition() {
		System.out.println("Le joueur se trouve à position " + departure);
	}

	/**
	 * Le joueur lance une dé tant que l'objectif n'est pas atteint il relance la dé
	 * Lancée et jeu
	 * 
	 * @param pl prend en paramètre un joueur
	 */
	public void throwDice(Player pl) {
		if (arrived < target) {
			cast = RandomDice.getRandomNumber();
			arrived += cast;
			count++;
			System.out.println(pl.getFirstName() + " lance la dé : et il obtient : " + cast);
			System.out.println(pl.getFirstName() + " se trouve à la position : " + arrived);
		} else if (arrived > target) {
			exceed = arrived - target;
			arrived = target - exceed;
			cast = RandomDice.getRandomNumber();
			arrived += cast;
			count++;
			System.out.println(pl.getFirstName() + " lance la dé : et il obtient : " + cast);
			System.out.println(pl.getFirstName() + " se trouve à la position : " + arrived);
		} else {
			System.out.println(
					"Bravooo!!!!!" + pl.getFirstName() + " vous avez atteint l'objectif avec " + count + " tours");
			System.exit(1);
		}
	}

	/**
	 * Le joueur choisi en 1 et 3 s'il veut continuer la partie, arrêter le jeu ou
	 * juste consulter son score
	 * 
	 * @param p prend en paramètre un joueur
	 */
	public void choose(Player p) {
		while (p.enterChoice() != 2) {
			switch (p.enterChoice()) {
				case 1:
					throwDice(p);
					;
					break;
				case 2:
					System.exit(1);
					break;
				case 3:
					System.out.println(p.getScore());
					break;
				default:
					break;
			}
		}
	}
}
