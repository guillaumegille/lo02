package noyau;

import console.Affichage;
import noyau.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/* Je choisi de mettre tout les getter en m�thodes de types boolean afin de
 * pouvoir redemander l'appel de la m�thode si la valeur transmise n'est pas valide
 */
/**
 * @version 1.0
 * @author guillaume le but de cette classe est de controler l'ensemble du jeu
 */
public class Controleur {

	private static Regle regle;
	private int sensJeu; // choisi d'�tre un int car il faut parfois rapeller le jour qui vient de jouer
							// pour qu'il rejoue
	//pourquoi as tu les joueurs en visibilité protected?
	protected static LinkedList<Joueur> joueurs;

	private Pile pile;

	private static int nbJoueurs;
	private static int nbCartes;
	Scanner scanner = new Scanner(System.in);

	public Controleur() {
		this.sensJeu = 1;
		this.joueurs= new LinkedList<Joueur>();
	}

	public static void main(String[] args) {

		Controleur.Init();
		//il faudrait une méthode pour lancer tour

	}

	public static void Init() {

		int s = Affichage.menuPrincipal();

		if (s == 1) {

			nbJoueurs = Affichage.nombreJoueurs();

			for (int i = 0; i < nbJoueurs; i++) {
				joueurs.add(new Joueur());

			}
			Joueur j1 = (JoueurHumain) joueurs.get(0);
			joueurs.add(0, j1);

		}

		else if (s == 2) {
			System.exit(0);

		}
		nbCartes = Affichage.tailleJeu();
		JeuDeCarte jeu = new JeuDeCarte(nbCartes);
		jeu.creerJeu(nbCartes);
		distribuerCartes(jeu.tabCartes, 5); // nbCartes = 5 ; à gérer en fct taille paquet
		Pioche pioche = new Pioche(jeu.tabCartes);
		Pile pile = new Pile(pioche);
		setRegle();
	}

	/*
	 * public void miseEnPlaceParti() { JeuDeCarte jeu; int nombreDeCarte;
	 * nombreDeCarte = this.affichage.demanderNombreDeCarteADistribuer(); jeu = new
	 * JeuDeCarte(nombreDeCarte); jeu.creerJeuxDeCarteOrdonnee(nombreDeCarte);
	 * this.pioche = jeu.creerPioche(nombreDeCarte, this.pile); this.setRegle();
	 * this.setNombreJoueur(); }
	 */
	public void tour() {
		boolean gagner = false;
		int tourDeJouer = 0;
		Joueur joueur;
		while (gagner == false) {
			this.affichage.afficherCarteJouer(this.pile.getDerniereCarteJouer());
			joueur = this.joueurs.get(tourDeJouer);
			joueur.jouerCarte(numeroDeCarte);

		}
	}

	public static void distribuerCartes(LinkedList<Carte> paquet, int nbCartesMain) {
		int c = paquet.size();
		for (int i = 0; i != nbCartesMain; i++) {
			for (int k = 0; k != getNbJoueurs(); i++) {
				joueurs.get(k).cartesEnMain.add(paquet.get(c));
				paquet.remove(c);
				c--;
			}
		}
	}

	private void genererPioche(Pioche pioche, Pile pile) {

		LinkedList<Carte> tabPioche;
		tabPioche = pile.getTabCartesPile();
		Collections.shuffle(tabPioche);
		pioche.setTabPioche(tabPioche);
		LinkedList<Carte> newPile = null;
		newPile.add(pioche.getPremiereCarte());
		pile.setTabCartesPile(newPile);

	}

	/**
	 * setNombreJoueur
	 * 
	 * @param nombreDeJoueur
	 *            type entier le but de cette fonction est d'entrer le nombre de
	 *            joueurs qui vont pouvoir participer aux jeux. elle va aussi creer
	 *            les joueurs
	 */

	public static void setRegle() {
		int choixRegle;
		do {
			choixRegle = Affichage.choixVariante();
			switch (choixRegle) {
			case 1:
				regle = new Variante1();
				break;
			case 2:
				regle = new variante2();
				break;
			default:
				Affichage.notifUtilisateur("votre choix n'est pas disponible.");
				break;
			}
		} while ((choixRegle < 1) && (choixRegle > 18));
	}

	public static int getNbJoueurs() {
		return nbJoueurs;
	}

	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	public void changerSensJeux()
	{
		this.sensJeu=this.sensJeu*(-1);
	}
	
	public Joueur getJoueurPrecedent(Joueur joueur)
	{
		int indice =this.joueurs.indexOf(joueur);
		if (indice==0)
		{
			return this.joueurs.get(this.joueurs.size());
		}
		else 
		{
			return this.joueurs.get(indice-1);
		}
	}

	public int getSensJeu()
	{
		return this.sensJeu;
	}
	

}
