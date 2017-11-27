package noyauxDeJeux;

public class Variante17 extends Variante1
{
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
	

	@Override
	//voir comment faire en fonction de  comment fonctionne un tour
  	public int quatre(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
  			&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
  			{throw new PoserCarteException();}
  		else
  			{return 1;}
  	}
	

	@Override
  	public int cinq(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
		{return 1;}
	
	@Override
	//probleme des cartes qui se cumul il faut voir comment résoudre ce problème avec les autre méthode
  	public int sept(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())
		&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
	else
		{return 2;}
	}
	
	@Override
	//problème des couleurs différentes
  	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 1;
	}
	
	@Override
  	public int neuf(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
		{
			int choix;
			int indice;
			do 
			{
				//demander le joueur chez qui vous voulez piocher une carte
			}
			while(choix<0&&choix>=control.getNombreJoueur());
			do
			{
				//choix carte
			}
			while(indice<0&&indice>=control.getJoueur(choix).getNombreDeCarte());
			suivant.prendreCarte(control.getJoueur(choix).donnerCarte(indice));
			return 1;
		}
	}
	
	@Override
  	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control)throws PoserCarteException
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
	
	public int joker(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if(pile.getDerniereCarteJouer().getValeur()==carteJouer.getValeur()||pile.getDerniereCarteJouer().getNomCouleur()=="huit")
		{
			throw new PoserCarteException();
		}
		
		else
		{
			if (control.getSensJeu()<0)
			{
				control.changerSensJeux();
			}
			return 1;
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
				{
					pioche.piocher(5,suivant);
				}
				if (carteJouer.getNomCouleur()=="trefle")
				{
					pioche.piocher(5,suivant);
				}
				return 1;
			}
  	}
	
}
