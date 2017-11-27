package noyau;

/**
 * @version1.0
 * 
 * @author guillaume classe herit� de Joueur et qui permet de rajouter la
 *         possiblit� de voir les cartes en main
 */
public class JoueurHumain extends Joueur {

	/**
	 * la methode montrerCarte re�oit le num�ro de carte � donner, v�rifie que
	 * celui-ci appartient au r�sultat d�sirer et renvoie la carte ayant le num�ro
	 * demander
	 * 
	 * @param numeroDeCarte
	 *            de type entier
	 * @return de type Carte
	 */
	public Carte montrerCarte(int numeroDeCarte) {
		if (numeroDeCarte >= 0 && numeroDeCarte < super.nombreDeCarteEnMain) {
			return super.carteEnMain.get(numeroDeCarte);
		} else {
			return null;
		}
	}
}
