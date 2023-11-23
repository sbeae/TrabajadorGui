package org.example;

public class Trabajador extends Persona implements Archivo {

	private String isapre;
	private String afp;

	/**
	 * 
	 * @param isapre
	 */
	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	/**
	 * 
	 * @param isapre
	 */
	public String getIsapre(String isapre) {
		return this.isapre;
	}

	/**
	 * 
	 * @param afp
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @param afp
	 */
	public String getAfp(String afp) {
		return this.afp;
	}

	@Override
	public void set() {
	}

	@Override
	public void get() {

	}

	@Override
	public void add() {

	}
}