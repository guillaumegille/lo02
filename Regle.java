package noyau;

public abstract class Regle {
	public static int nombreCarte;

	public abstract int as(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int roi(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int dame(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int valet(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int dix(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int neuf(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int huit(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int sept(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int six(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int cinq(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int quatre(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int trois(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);

	public abstract int deux(Joueur joueur, Carte carteJouer, Pile pile, Pioche pioche);
}
