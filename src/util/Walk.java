package util;

public class Walk {
	int arrived;
	int exceed;
	int target = Constants.TARGET;
	int departure = Constants.DEPARTURE;
	int cast = RandomDice.getRandomNumber();

	public void play() {

		arrived = departure + cast;
		System.out.println("le joueur se trouve à position" + arrived);
	}

	public void move(int arrived) {
		if (arrived < target) {
			cast = RandomDice.getRandomNumber();
			arrived += cast;
			System.out.println("le joueur se trouve à position" + arrived);
		} else if (arrived > target) {
			exceed = arrived - target;
			arrived = target - exceed;
			cast = RandomDice.getRandomNumber();
			arrived += cast;
		} else {
			System.out.println("Bravooo!!!!! vous avez atteint l'objectif");
		}
	}
}
