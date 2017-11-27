package noyauxDeJeux;

public class Variante12 extends Variante11 
{

	@Override
  	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
  		else
  			{return 1;}
  	}
	
	@Override
	public int sept(Joueur joueur ,  Joueur suivant ,Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{	
			if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
				&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
				{throw new PoserCarteException();}
			else
			{
				if (control.getNombreJoueur()==2)
					{return 0;}
				else 
					{
						control.changerSensJeux();
						return 1;
					}
			}
	}
	
	
	public int joker(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		pioche.piocher(4,suivant);
		int couleurJocker;
		//demander la couleur du jocker
		carteJouer.changerCouleur(couleurJocker);
		return 1;
	}
}
