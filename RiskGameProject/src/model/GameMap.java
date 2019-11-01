package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class contains the map attributes
 */
public class GameMap {
	private HashMap<Integer, Continents> continents;
	private HashMap<Integer, Countries> countries;
	private HashMap<Integer, ArrayList<Integer>> boundries;	

	/**
	 * @Default Constructor This method initiates the variables
	 */
	public GameMap() {		
		continents = new HashMap<Integer, Continents>();
		countries = new HashMap<Integer, Countries>();
		boundries = new HashMap<Integer, ArrayList<Integer>>();
	}

	public HashMap<Integer, Continents> getContinents() {
		return continents;
	}

	public void setContinents(HashMap<Integer, Continents> continents) {
		this.continents = continents;
	}

	public HashMap<Integer, Countries> getCountries() {
		return countries;
	}

	public void setCountries(HashMap<Integer, Countries> countries) {
		this.countries = countries;
	}

	public HashMap<Integer, ArrayList<Integer>> getBoundries() {
		return boundries;
	}

	public void setBoundries(HashMap<Integer, ArrayList<Integer>> boundries) {
		this.boundries = boundries;
	}
}
