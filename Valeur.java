package noyau;

/**
 * @version 1.0
 * @author guillaume cette enum�ration fixe la valeur de la carte de la carte et
 *         permet de la renvoyer grace � la methode getValeur.
 */
public enum Valeur {

	as("as"), roi("roi"), dame("dame"), valet("valet"), dix("dix"), neuf("neuf"), huit("huit"), sept("sept"), six(
			"six"), cinq("cinq"), quatre("quatre"), trois("trois"), deux("deux");

	private String valeur;

	Valeur(String valeur) {
		this.valeur = valeur;
	}

	/**
	 * methode qui permet de retourner la valeur de la carte
	 * 
	 * @return de type String
	 */
	public String getValeur() {
		return this.valeur;
	}
}
