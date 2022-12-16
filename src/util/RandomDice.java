package util;

public class RandomDice {
	
	public static final int getRandomNumber() {
		 return (int) (Math.random() * (Constantes.MAX - Constantes.MIN) + Constantes.MIN);
	}
}
