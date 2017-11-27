package noyau;

public class StrategieClassique implements Strategie{

	@Override
	public boolean direCarte(Joueur j) {
		if (j.cartesEnMain.size()==1) {
			return true;
		}
		return false;
	}
	
		
	
}
