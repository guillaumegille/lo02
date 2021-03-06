package noyauxDeJeux;

public class Variante13 extends Variante1
{
	@Override 
	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()&&pile.getDerniereCarteJouer().getNomValeur()!="roi")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	 
	@Override
	public int roi(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
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
	
	@Override
  	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
  		else
  			{return 2;}
  	}
	
	public int as2(Joueur joueur , Joueur suivant,Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
	{
		if (pile.getDerniereCarteJouer().getNomValeur()!="as")
		{
			throw new PoserCarteException();
		}
		else
		{	
			int i=1;
			Carte carte;
			//tour
		
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
 				
 				if(joueur.getNombreDeCarte()==0)
 				{
 					pioche.piocher(2,suivant);
 					return 1;
 				}
 				else
 				{	
 					int i=1;
 					Carte carte;
 					//tour
 					else if (carte.getNomValeur()=="jocker")
 					{
 						pioche.piocher(5,suivant);
 						return 2;
 					}
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
	
	public int joker(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		//tour//carte obtenue avec tour
		if (carte.getNomValeur()=="jocker")
		{
			pioche.piocher(6, control.getJoueurSuivant(suivant));
			return 2;
		}
		else if (carte == null)
		{
			pioche.piocher(3,suivant);
			return 1;
		}
		
		else 
			{throw new PoserCarteException();}
	}
	
	@Override
  	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		//demander la couleurs de la carte
		int couleursCarteTemp;
		Carte carte =carteJouer;
		couleurCarteTemp =carteJouer.getCouleur();
		carteJouer.changerCouleur(indice);
		//tour
		carte.changerCouleur(couleursCarteTemp);
	}
	
}
