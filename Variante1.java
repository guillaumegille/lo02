package noyauxDeJeux;



public class Variante1  extends Regle
{	
	public static final int numeroDeRegle =1;
	
	@Override
	 public int as(Joueur joueur , Joueur suivant,Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
 	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
 			{
				throw new PoserCarteException();
 			}
 		else
 			{return 1;}
 	}
	
	 @Override
  	public int roi(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	 
	@Override
  	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
  	}
	
	@Override
  	public int dix(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control)throws PoserCarteException
  	{	
			if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
				{throw new PoserCarteException();}
			else
			{
				if(joueur.getNombreDeCarte()==0)
				{
					pioche.piocher(1, joueur);
					return 1;
				}
				else
				{
					return 0;
				}
		}
  		
  	}
	
	@Override
  	public int neuf(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 1;
	}
	
	@Override
  	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int six(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche piocher,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int cinq(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int quatre(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
  			{throw new PoserCarteException();}
  		else
  			{return 1;}
  	}
	
	@Override
  	public int trois(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int deux(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
}