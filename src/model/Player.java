package model;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//Déclaration des variables
public class Player {
	private String firstName;
	private String lastName;
	private String id;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// Saisie au clavier des informations du joueur
	// Levée d'exception en cas de saisie incorrecte des informations
	public Player() {
		try {
			this.firstName = br.readLine();
			this.lastName = br.readLine();
			this.id = br.readLine();
		} catch (IOException e) {
			System.err.println("Veuillez verifier si vos coordonnées sont valides");
		}
	}

	/**
	 * 
	 * @return retourne le prénom du joueur
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName permet la saisie du prénom du joueur
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return retourne le nom du joueur
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param firstName permet la saisie du nom du joueur
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return retourne l'identifiant du joueur
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param firstName permet la saisie de l'identifiant du joueur
	 */
	public void setId(String id) {
		this.id = id;
	}

	// Affiche les informations du joueur : nom,prénom et identifiant
	@Override
	public String toString() {
		return "Prénom : " + firstName + " , " + " Nom : " + lastName + " , " + " Id : " + id + " va se lancer";
	}

}
