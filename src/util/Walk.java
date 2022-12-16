package util;

import model.*;

public class Walk {
	int arrived;
	int exceed;
	int target = Constants.TARGET;
	int departure = Constants.DEPARTURE;
	int cast = RandomDice.getRandomNumber();
	int count = Constants.MIN;

	// Walk<Player> wl = new Walk<Player>();

	public void initPosition() {
		System.out.println("Le joueur se trouve à position " + departure);
	}

	public void throwDice(Player pl) {
		arrived = departure + cast;
		System.out.println(pl.getFirstName() + " se trouve à la position " + arrived);
		if (arrived < target) {
			cast = RandomDice.getRandomNumber();
			arrived += cast;
			count++;
			System.out.println(pl.getFirstName() + " se trouve à la position " + arrived);
		} else if (arrived > target) {
			exceed = arrived - target;
			arrived = target - exceed;
			cast = RandomDice.getRandomNumber();
			arrived += cast;
			count++;
			System.out.println(pl.getFirstName() + " se trouve à la position " + arrived);
		} else {
			System.out.println(
					"Bravooo!!!!!" + pl.getFirstName() + " vous avez atteint l'objectif avec " + count + " tour");
		}
	}
}
