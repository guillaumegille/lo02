package noyauxDeJeux;

public class Variante10 extends Variante1
{

	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{	
			if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
				{throw new PoserCarteException();}
			else
			{
				return 1;
			}
  	}
	
	@Override
  	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
		else
			{if (control.getNombreJoueur()==2)
				{return 0;}
			else
				{return 1;}
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
	 				int i=1;
	 				Carte carte;
	 				//tour
	 				else if(carte.getNomValeur()=="huit")
	 					{return 1;}
	 				
	 				else if (carte.getNomValeur()=="as")
	 				{
	 					i=i+this.as2(suivant, control.getJoueurSuivant(suivant), carteJouer, pile, pioche, control);
	 					return i;
	 				}
	 				else
	 				{
	 					pioche.piocher(2*i,suivant);
	 					return i;
	 				}
	 			}
	 	}
	public int as2(Joueur joueur , Joueur suivant,Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
	{
		if (pile.getDerniereCarteJouer().getNomValeur()!="huit"
			&&pile.getDerniereCarteJouer().getNomValeur()!="as")
		{
			throw new PoserCarteException();
		}
		else
		{	
 				int i=1;
 				Carte carte;
 				//tour
 				else if(carte.getNomValeur()=="huit")
 					{return 1;}
 				
 				else if (carte.getNomValeur()=="as")
 				{
 					i=i+this.as2(suivant, control.getJoueurSuivant(suivant), carteJouer, pile, pioche, control);
 					return i;
 				}
 				else
 				{
 					pioche.piocher(2*i,suivant);
 					return i;
 				}
		}
	}
	 
}
