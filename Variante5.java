package noyauxDeJeux;

public class Variante5 extends Variante1
{
	@Override
	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		if (((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			)||((control.getNombreJoueur()==2)&& 
			pile.getDerniereCarteJouer().getNomValeur()!="dix"))
		{
			throw new PoserCarteException();
		}
		else
		{
		
			return 0;
		}
	}
	

	@Override 
	public int dix (Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		if (((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()
			)||((control.getNombreJoueur()==2)&& 
			pile.getDerniereCarteJouer().getNomValeur()!="sept"))
		{
			throw new PoserCarteException();
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public int deux(Joueur joueur ,Joueur suivant,Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()))
			||((pile.getDerniereCarteJouer().getNomValeur()!="sept")
			||pile.getDerniereCarteJouer().getNomValeur()!="dix"))
			{throw new PoserCarteException();}
		else
			{
				if (control.getNombreJoueur()==2)
					{return 0;}
				else 
					{return 2;}
			}
	
	}
	
	@Override
	 public int as(Joueur joueur , Joueur suivant,Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
	 	{
			if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
				&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
	 			{
					throw new PoserCarteException();
	 			}
	 		else
	 			{
	 				//tour
	 				if((pile.getDerniereCarteJouer().getNomValeur()!="huit")
	 						||(pile.getDerniereCarteJouer().getNomValeur()!="as"))
	 				{
	 					return 1;
	 				}
	 				
	 				else 
	 					{
	 						pioche.piocher(2,suivant);
	 						return 1;
	 					}
	 			}
	 	}
		
}
