package noyauxDeJeux;

public class Variante15 extends Variante1
{
	
	@Override
  	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{	
		int choix;
	
		//demander si vous voulez passer le tour
		if (choix == 1)
			{return 1;}
		else 
		{
			return 2;
		}
	}
	
	@Override
  	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 1;
		//problème du changement de couleur
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
					return 0;
				}
				else
				{
					return 0;
				}
			}
  	}
			
	@Override
	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		
				{throw new PoserCarteException();}
			else
				{
					if (carteJouer.getNomCouleur()=="pique")
						{pioche.piocher(4,suivant);}
					return 1;
				}
  	}
	
	@Override
  	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
		{
			int choix;
			//demander ce que l'on veut faire;
			if (choix==1)
				{return 2;}
			else
				{control.changerSensJeux();
				return 1;}
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
 					else if (carte.getNomValeur()=="huit")
 					{
 						return 2;
 					}
 					else if (carte.getNomValeur()=="as")
 					{
 						return 2;
 					}
 					else
 					{
 						pioche.piocher(2,suivant);
 						return i;
 					}
 				}
 			}
 	}
}
