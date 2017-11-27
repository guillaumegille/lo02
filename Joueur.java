package noyau;

import java.util.ArrayList;

/**
 * @version 2.0
 * @author guillaume le joueur est la classe qui va stocker les differerents
 *         cartes que le joueur poss�dent et va permetre acceder
 */
public class Joueur {
	private String pseudo;
	protected int nbCartes;
	// private int nombreDePointEnMain;
	protected ArrayList<Carte> cartesEnMain;
	//attention il manque le constructeur
	public void prendreCarte(Carte cartePrise) {
		this.nbCartes++;
		this.cartesEnMain.add(cartePrise);
	}

	public Carte jouerCarte(int numeroDeCarte) {
		Carte carteTemporaire;
		carteTemporaire = this.cartesEnMain.get(numeroDeCarte);
		int i;
		for (i = numeroDeCarte; i < nbCartes; i++) {
			this.cartesEnMain.remove(numeroDeCarte);
		}
		return carteTemporaire;
	}

	public int getNombreDeCarte() {
		return this.nbCartes;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public Carte donnerCarte(int indice)
	{
		return this.carteEnMain.remove(indice);
	}
	
	public ArrayList <Carte> setJeuxEnMain()
	{
		return this.carteEnMain;
	}
	
	public void getJeuxEnMain(ArrayList <Carte> carteEchange)
	{
		this.carteEnMain=carteEchange;
	}
}
