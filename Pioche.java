package noyau;

import java.util.Collections;

/**Pioche est un obet qui va stocker les cartes de la pioche et va ainsi permettre leur acc�s 
 * @version 2.0
 * @author guillaume
 *
 */

import java.util.LinkedList;

public class Pioche {

	private LinkedList<Carte> tabPioche;
	private int nbCartesPioche;
	private Pile pile;

	/**
	 * le constructeur sert � cr�er la pioche et prend toutes valeurs les valeurs
	 * necessaires pour la pioche
	 * 
	 * @param jeuxDeCarte
	 *            de type Carte et est un tableau,
	 * @param nombreDeCarte
	 *            de type entier
	 */
	public Pioche(LinkedList<Carte> tab) {
		this.tabPioche = tab;

	}

	/**
	 * la methode piocher permet de donner le nombre de carte demander au Jouer
	 * fourni en param�tre
	 * 
	 * @param nombreDeCarteAPrendre
	 *            de type int
	 * @param preneur
	 *            de type Joueur
	 */
	public void piocher(int nombreDeCarteAPrendre, Joueur preneur) {
		int i;
		for (i = 0; i < nombreDeCarteAPrendre; i++) {
			preneur.prendreCarte(this.tabPioche.removeFirst());
			this.nbCartesPioche--;
			if (this.nbCartesPioche < 1) {
				Controleur.genererPioche();
			}
		}
	}

	public Carte getPremiereCarte() {
		this.nbCartesPioche--;
		return this.tabPioche.removeFirst();
	}

	/*
	 * int nombreDeCarte = this.pile.getNombreCarte() - 1; int i; for (i = 1; i <=
	 * nombreDeCarte; i++) { int numeroCarte; int nombreCarteDansPile;
	 * nombreCarteDansPile = this.pile.getNombreCarte(); numeroCarte = 1 + (int)
	 * Math.random() * (nombreCarteDansPile - 2);
	 * this.tabPioche.add(this.pile.setCarte(numeroCarte));
	 */

	}

	public void creerPioche(Carte carteAAjouter) {
		this.tabPioche.add(carteAAjouter);
	}

	/**
	 * la methode donnerCarte permet de donner le nombre de carte d�fini en
	 * param�tre et de donner au joueur ces cartes
	 * 
	 * @param personne
	 *            de type joueur
	 * @param nombreDeCarteADonner
	 *            de type entier
	 */
	public void donnerCarte(Joueur personne, int nombreDeCarteADonner) {
		// pour eviter de cr�er une m�thode de plus dans joueur je fais le choix
		// d'utiliser ici la m�thode pioche du joueur.
		for (int i = 0; i < nombreDeCarteADonner; i++) {
			personne.prendreCarte(this.tabPioche.remove());
			this.nbCartesPioche--;
		}
	}

	public LinkedList<Carte> getTabPioche() {
		return tabPioche;
	}

	public void setTabPioche(LinkedList<Carte> tabPioche) {
		this.tabPioche = tabPioche;
	}
}
