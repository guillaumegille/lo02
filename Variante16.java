package noyauxDeJeux;

public class Variante16 extends Variante1
{
	@Override
  	public int deux(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	if ((pile.getDerniereCarteJouer().getNomValeur()!=carteJouer.getNomValeur())&&(pile.getDerniereCarteJouer().getNomCouleur())!=carteJouer.getNomCouleur())
		{throw new PoserCarteException();}
		else
		{
			int nbCarteDonner=0;
			int carte;
			int choix;
			while (nbCarteDonner<3)
				{
					do
					{
						//demander joueur qui doit prendre et le nombre de carte a prendre
					}	
					while(carte<=0&&carte>3-nbCarteDonner&& choix>=0&&choix<control.getNombreJoueur());
					pioche.piocher(carte,control.getJoueur(choix));
				}
		}
	}
	
	@Override
  	public int valet(Joueur joueur , Joueur suivant , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
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
		{return 2;}
  	}
	
	@Override
  	public int huit(Joueur joueur ,Joueur suivant  , Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{ 	
		return 1;//probleme du changement de figure
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
			{
				int choix;
				do{
				//demander le joueur a qui donner les cartes
				{
				while(choix<0;choix>control.getNombreJoueur());
				pioche.piocher(2,control.getJoueur(choix));
				return 1;
			}
	}
	
	public int joker(Joueur joueur ,Joueur suivant, Carte carteJouer , Pile pile ,Pioche pioche,Controleur control) throws PoserCarteException
	{
		int nbCarteDonner=0;
		int carte;
		int choix;
		while (nbCarteDonner<6)
			{
				do
				{
					//demander joueur qui doit prendre et le nombre de carte a prendre
				}	
				while(carte<=0&&carte>6-nbCarteDonner&& choix>=0&&choix<control.getNombreJoueur());
				pioche.piocher(carte,control.getJoueur(choix));
			}
	}
}
