package util;

public class RandomDice {

	public static final int getRandomNumber() {
		return (int) (Math.random() * (Constants.MAX - Constants.MIN) + Constants.MIN);
	}
}
