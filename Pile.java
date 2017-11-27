package noyau;
/**
 * @version 1.0
 * @author guillaume
 *la class pile est l'objet qui va permettre de stocker les différentes cartes jouer
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Pile {

	private int nbCartesPile;
	private LinkedList<Carte> tabCartesPile;
	private Carte derniereCarte;

	/**
	 * constucteur de la class Pile
	 * 
	 * @param nombreCarteJeux
	 *            de type int
	 * @param pioche
	 *            de type carte
	 */
	public Pile(Pioche pioche) {
		this.nbCartesPile = 0;
		this.derniereCarte = pioche.getPremiereCarte();
	}

	public void cartePoser(Carte carteJouer) {
		this.derniereCarte = carteJouer;
		this.tabCartesPile.add(carteJouer);
		this.nbCartesPile++;
	}

	public int getNombreCarte() {
		return this.nbCartesPile;
	}

	public Carte setCarte(int numeroCarte) {

		return this.tabCartesPile.remove(numeroCarte);
	}

	public Carte getDerniereCarteJouer() {
		return this.derniereCarte;
	}

	public void setTabCartesPile(LinkedList<Carte> tabCartesPile) {
		this.tabCartesPile = tabCartesPile;
	}

	public LinkedList<Carte> getTabCartesPile() {
		return tabCartesPile;
	}

}