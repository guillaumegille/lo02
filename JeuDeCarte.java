package noyau;
/**
 * @version 2.0
 * @author guillaume
 *	le but de cette classe est de cr�er les cartes de cr�er la pioche et donner les cartes aux joueurs
 *
 */

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import noyau.Controleur;

public class JeuDeCarte {

	protected LinkedList<Carte> tabCartes;
	private int nbCartes;

	public JeuDeCarte(int nombreDeCarte) {
		this.nbCartes = nombreDeCarte;
		this.tabCartes = new LinkedList<Carte>();
	}

	/**
	 * la fonction creer jeuxDeCarteOrdonnee est de faire appel au constructeur de
	 * carte et de stocker celle-ci dans un tableau
	 * 
	 * @param nombreDeCarte
	 *            de type entier
	 */
	public void creerJeu(int nbCartes)
	// Dans le cr�ateur de carte on entre d'abord la couleurs donc nombre de 1�4;
	// Puis on entre la valeurs de la carte.
	{
		// this.nombreCarte = nombreDeCarte;
		if (nbCartes == 32) {

			for (int i = 0; i < 4; i++) {
				for (int k = 0; i < 8; i++) {
					this.tabCartes.add(new Carte(i, k));
				}
			}
			// return tabCartes;
		} else if (nbCartes == 34) {
			for (int i = 0; i < 4; i++) {
				for (int k = 0; k < 8; i++) {
					this.tabCartes.add(new Carte(i, k));
				}
			}
			this.tabCartes.add(new Carte(4));
			this.tabCartes.add(new Carte(5));
			// return tabCartes;
		} else if (nbCartes == 52) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 14; k++) {
					this.tabCartes.add(new Carte(j, k));
				}
			}
			// return tabCartes;
		} else if (nbCartes == 54) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 14; k++) {
					this.tabCartes.add(new Carte(j, k));
				}
			}
			this.tabCartes.add(new Carte(4));
			this.tabCartes.add(new Carte(5));
			// return tabCartes;
			// le traitement de la taille du paquet est effectué
			// au préalable lors de la saisie de la valeur par l'utilisateur
			// via une exception à implémenter
		}
	}

	/**
	 * la methode creerTableauxDeCarteMelange ne prend pas de param�tre et sert �
	 * melanger les cartes du paquet ordonn�
	 */
	//je ne comprends pas comment cette methode peu retourner le paquet de carte que l'on vient de créer et en renvoyer un mélanger
	public ArrayList melangerJeu(ArrayList j) {
		Collections.shuffle(j);
		return j;
	}

	}

	/**
	 * la m�thode pioche va cr�er un objet de type pioche et la retourner.Il lui
	 * faut fournir le nombre de carte � mettre dans la pioche.
	 * 
	 * @param nombreDeCarteAMettreDansPioche
	 *            de type entier et pile de type Pioche
	 * @return de type pioche
	 */

/*
	public Pioche creerPioche(int nombreDeCarteAMettreDansPioche, Pile pile) {
		Pioche piocheDuJeux = new Pioche(nombreDeCarteAMettreDansPioche, pile);
		while (this.tabCartes.isEmpty()) {
			// desol� pour cette methode d�guellasse
			piocheDuJeux.creerPioche(this.tabCartes.remove(1 + (int) Math.random() * (this.tabCartes.size() - 2)));

		}
		return piocheDuJeux;
	}
	*/


