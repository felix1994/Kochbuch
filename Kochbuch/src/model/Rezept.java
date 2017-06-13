package model;

import java.util.ArrayList;

public class Rezept {
	private String rezeptname;
	private String beschreibung;
	private String anleitung;
	private String schwierigkeit;
	private String dauer;
	private String typ;
	
	private ArrayList<Zutat> zutaten;
	
	public void addZutat(Zutat z){
		zutaten.add(z);
	}

	public String getRezeptname() {
		return rezeptname;
	}

	public void setRezeptname(String rezeptname) {
		this.rezeptname = rezeptname;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getAnleitung() {
		return anleitung;
	}

	public void setAnleitung(String anleitung) {
		this.anleitung = anleitung;
	}

	public String getSchwierigkeit() {
		return schwierigkeit;
	}

	public void setSchwierigkeit(String schwierigkeit) {
		this.schwierigkeit = schwierigkeit;
	}

	public String getDauer() {
		return dauer;
	}

	public void setDauer(String dauer) {
		this.dauer = dauer;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public ArrayList<Zutat> getZutaten() {
		return zutaten;
	}

	public void setZutaten(ArrayList<Zutat> zutaten) {
		this.zutaten = zutaten;
	}
	
	
	
}
