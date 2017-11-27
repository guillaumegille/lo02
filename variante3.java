package noyauxDeJeux;

import java.util.ArrayList;

public class variante3 extends variante2
{
	@Override
  	public int roi(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()&&pile.getDerniereCarteJouer().getNomValeur()!="dame")
		{throw new PoserCarteException();}
	else
		{return 1;}
	}
	
	@Override 
	public int dame(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur()&&pile.getDerniereCarteJouer().getNomValeur()!="roi")
			{throw new PoserCarteException();}
		else
			{return 1;}
	}
	
	@Override
	public int six(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
			{
				pioche.piocher(1,suivant);
				return 1;
			}
	}
	
	@Override
	public int neuf(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
			{
				int indice;
				//affichage pour demander quel carte le joueur veut il prendre
				suivant.prendreCarte(joueur.donnerCarte(indice));
				return 1;
			}
	}
	
	@Override
	public int as(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
			{
				int indice;
				int choixJoueur;
				Joueur temp;
				//affichage demander le numero du joueur a qui ont veut donner 2 De ses cartes 
				//affichage pour demander quel carte le joueur veut il prendre
				temp=control.getJoueur(indice);
				suivant.prendreCarte(temp.donnerCarte(indice));
				suivant.prendreCarte(temp.donnerCarte(indice));
				return 1;
			}
	}
	
	@Override
	public int quatre(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
  	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
  			{throw new PoserCarteException();}
  		else
  			{
  			//affichage demander a entrer 4
  			if
  				{
  					if((1+(int)Math.random()*(5)%2)=0)
  					{
  						pioche.piocher(1,joueur);
  					}
  				}
  			return 1;
  			}
  	}
	
	@Override
	public int cinq(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 1;
	}
	
	@Override
 	public int trois(Joueur joueur , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
			{throw new PoserCarteException();}
		else
		{
			if (carteJouer.getNomCouleur()=="coeur")
			{
				Joueur joueurtemp ;
				joueurtemp = control.getJoueurPrecedent(joueur);
				ArrayList <Carte> jeux=joueurtemp.setJeuxEnMain();
				joueurtemp.getJeuxEnMain(joueur.setJeuxEnMain());
				joueur.getJeuxEnMain(jeux);
				return 1;
			}
			else
				{return 1;}
		}
	}
	
	
}
