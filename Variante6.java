package noyauxDeJeux;

public class Variante6 extends Variante1
{
	@Override
	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
  			&&((pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
  			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
		{throw new PoserCarteException();}
	else
		{
		if(control.getNombreJoueur()==2)
			{return 0;}
		else
		{
			return 2;
		}
		}
  	}
	
	@Override
  	public int dix(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control)throws PoserCarteException
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
	public int deux(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
			{throw new PoserCarteException();}
		else
			{	if (carteJouer.getNomCouleur()=="pique")
					{
						pioche.piocher(4,suivant);
						return 1;
					}
				else
				{
					pioche.piocher(2,suivant);
					return 1;
				}
			}
	}
	public int joker(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		pioche.piocher(5, suivant);
		return 1;
	}
	public int roi(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	 
	@Override
  	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	
  		
  	
	
	@Override
  	public int neuf(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()			&& pile.getDerniereCarteJouer().getNomValeur()=="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
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
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur()
			)&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
					&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
					&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override
  	public int six(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche piocher,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	
	@Override
  	public int cinq(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur()
			)&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	
	@Override
  	public int quatre(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
  			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
  			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
  			{throw new PoserCarteException();}
  		else
  			{return 1;}
  	}
	
	@Override
  	public int trois(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			&& pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&& pile.getDerniereCarteJouer().getNomValeur()!="joker")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	
}
