package noyau;

/**
 * @version 1.0
 * @author guillaume cette enum�ration sert � d�finir la valeur des cartes du
 *         jeux.
 *
 */
public enum Couleur {

	pique("pique"), trefle("trefle"), coeur("coeur"), carreau("carreau"), jocker1("jocker1"), jocker2("jocker2");

	private String valeur = "";

	Couleur(String valeur) {
		this.valeur = valeur;
	}

	public String getValeur() {
		return this.valeur;
	}
}
