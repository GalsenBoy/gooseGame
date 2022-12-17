package util;

public class RandomDice {
	/**
	 * 
	 * @return retourne un entier entre 1 et 6 au hasard
	 */
	public static final int getRandomNumber() {
		return (int) (Math.random() * (Constants.MAX - Constants.MIN) + Constants.MIN);
	}
}
