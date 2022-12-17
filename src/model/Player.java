package model;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Player {
	private String firstName;
	private String lastName;
	private String id;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Player() {
		try {
			this.firstName = br.readLine();
			this.lastName = br.readLine();
			this.id = br.readLine();
		} catch (IOException e) {
			System.err.println("Veuillez verifier si vos coordonnées sont valides");
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nom : " + lastName + " , " + " firstName : " + firstName + " , " + " id : " + id + " va se lancer";
	}

}
