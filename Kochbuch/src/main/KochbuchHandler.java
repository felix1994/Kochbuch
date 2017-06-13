package main;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.Kochbuch;
import model.Rezept;
import model.Zutat;

public class KochbuchHandler extends DefaultHandler{
	
	private Kochbuch kochbuch;
	private Rezept rezept;
	private Zutat zutat;
	private ArrayList<Rezept> rezepte = new ArrayList<>();
	private ArrayList<Zutat> zutaten = new ArrayList<>();
	private String inhalt;
	
	public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
		switch(qName){
		case "Kochbuch":
			kochbuch = new Kochbuch();
			break;
		case "Rezept":
			rezept = new Rezept();
			break;
		case "Zutat":
			zutat = new Zutat();
			break;
		}

	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {
		switch(qName){
		case "Kochbuch":
			kochbuch.setRezepte(rezepte);
			break;
		case "Rezept":
			rezepte.add(rezept);
		case "Zutat":
			zutaten.add(zutat);
		case "Zutaten":
			rezept.setZutaten(zutaten);
			zutaten.clear();
			break;
		case "RezeptName": rezept.setRezeptname(inhalt);
			break;
		case "Beschreibung": rezept.setBeschreibung(inhalt);
			break;
		case "Anleitung": rezept.setAnleitung(inhalt);
			break;
		case "Schwierigkeit": rezept.setSchwierigkeit(inhalt);
			break;
		case "Dauer": rezept.setDauer(inhalt);
			break;
		case "Typ": rezept.setTyp(inhalt);
			break;
		case "ZutatName": zutat.setName(inhalt);
			break;
		case "Menge": zutat.setMenge(inhalt);
			break;
		case "Masseinheit": zutat.setMasseinheit(inhalt);
			break;
		}
	}

	public void characters(char ch[], int start, int length) throws SAXException {
		inhalt = String.copyValueOf(ch, start, length).trim();
	}
	
	public Kochbuch getKochbuch(){
		return kochbuch;
	}

}
