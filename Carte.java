package noyau;

/**
 * @version 1.0 beta
 * @author guillaume cette class permet de d�finir l'�tat de la carte en passant
 *         par une �numration
 */
public class Carte {

	private int valeur;
	private int couleur;
	private Valeur[] tableauxDesValeursPossible;
	private Couleur[] tableauxDesCouleursPossible;

	// constructeur de l'objet
	public Carte(int couleur, int valeur) {
		this.tableauxDesValeursPossible = Valeur.values();
		this.tableauxDesCouleursPossible = Couleur.values();
		this.valeur = valeur;
		this.couleur = couleur;
	}

	public Carte(int couleur) {
		this.tableauxDesValeursPossible=Valeur.values();
		this.tableauxDesCouleursPossible=Couleur.values();
		this.couleur=5;
		this.valeur=couleur;

	}

	/**
	 * la methode getValeur() retourne le num�ro de la valeur de la carte.
	 * 
	 * @return de type int
	 */
	public int getValeur() {
		return this.valeur;
	}

	/**
	 * la m�thode getNomValeur() retourne le nom de la valeurs de la carte.
	 * 
	 * @return de type String
	 */
	public String getNomValeur() {
		return this.tableauxDesValeursPossible[this.valeur].getValeur();
	}

	/**
	 * la methode getCouleur() retourne le num�ro de la couleur de la carte.
	 * 
	 * @return de type int
	 */
	public int getCouleur() {
		return this.couleur;
	}

	/**
	 * la methode getNomCouleur() retourne le nom de la couleur de la carte
	 * 
	 * @return de type String
	 */
	public String getNomCouleur() {
		return this.tableauxDesCouleursPossible[this.couleur].getValeur();
	}

	public void changerCouleur(int indice)
	{
	
			this.couleur=indice;
		
	}
}
