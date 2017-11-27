package noyauxDeJeux;

public class Variante14 extends Variante1
{
	public int sept2(Joueur joueur , Joueur suivant,Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
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
		
			else if (carte.getNomValeur()=="sept")
			{
				i=i+this.sept2(suivant, control.getJoueurSuivant(suivant), carteJouer, pile, pioche, control);
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
	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
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
 					
 					else if (carte.getNomValeur()=="sept")
 					{
 						i=i+this.sept2(suivant, control.getJoueurSuivant(suivant), carteJouer, pile, pioche, control);
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
	
	@Override
  	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 0;
	}
	
	@Override
	public int dix(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control)throws PoserCarteException
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
	 public int as(Joueur joueur , Joueur suivant,Carte carteJouer , Pile pile , Pioche pioche ,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{
				throw new PoserCarteException();
			}
		else
			{return 2;}
	}
	
	@Override
  	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		//demander la couleurs de la carte
		int couleursCarteTemp;
		Carte carte =carteJouer;
		couleurCarteTemp =carteJouer.getCouleur();
		carteJouer.changerCouleur(indice);
		//tour
		carte.changerCouleur(couleursCarteTemp);
		return 2;
	}
}

