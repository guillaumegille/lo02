package noyauxDeJeux;

public class Variante8 extends Variante1
{
	@Override
  	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 0;}
	}
	
	public int neuf(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control)throws PoserCarteException
  	{	
			if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
				&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
				&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
				&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
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
	
	@Override
	public int dix(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException;
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
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
	
	
}
