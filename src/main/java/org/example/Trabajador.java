public class Trabajador extends Persona implements Archivo {

	private string isapre;
	private string afp;

	/**
	 * 
	 * @param isapre
	 */
	public void setIsapre(string isapre) {
		this.isapre = isapre;
	}

	/**
	 * 
	 * @param isapre
	 */
	public string getIsapre(string isapre) {
		return this.isapre;
	}

	/**
	 * 
	 * @param afp
	 */
	public void setAfp(string afp) {
		this.afp = afp;
	}

	/**
	 * 
	 * @param afp
	 */
	public string getAfp(string afp) {
		return this.afp;
	}

}