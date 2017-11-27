package noyauxDeJeux;


public class variante2 extends Variante1
{
	@Override
	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 2;}
	}
	
	@Override
	public  int neuf (Joueur joueur , Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException 
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
		{
			pioche.piocher(1,suivant);
			return 1;
		}
	}
	
	@Override
	public int valet(Joueur joueur ,  Joueur suivant ,Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
		else
		{
			control.changerSensJeux();
			return 1;
		}
	}
	
	@Override
	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 1;
	}
	@Override
	//a modifier mais voir si on ne fait pas un methode de tour a un joueur 
	 public int as(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
	 	{
			if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
	 			{
					throw new PoserCarteException();
	 			}
	 		else
	 			{return 1;}
	 	}
}
