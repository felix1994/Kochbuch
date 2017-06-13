package model;

import java.util.ArrayList;

public class Kochbuch {
	
	private ArrayList<Rezept> rezepte;

	public ArrayList<Rezept> getRezepte() {
		return rezepte;
	}

	public void setRezepte(ArrayList<Rezept> rezepte) {
		this.rezepte = rezepte;
	}
	
	public void addRezept(Rezept r){
		rezepte.add(r);
	}
}
