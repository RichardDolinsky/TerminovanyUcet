package sk.richard.refaktor;

public class SporiaciUcet extends BankovyUcet {
	private double urokovaSadzba;
	private double cislo;
	private double vysledokBezUrokom;
	private double aktualnyZostatok;

	public SporiaciUcet(double urokovaSadzba) {
		super(0);
		this.urokovaSadzba = urokovaSadzba;
		// TODO Auto-generated constructor stub
	}

	public void vloz(int ciastka) {
		super.setVklad(ciastka);

	}
/**
 * vklada ciastku na bezny ucet 
 * @param ciastka ciastka penazi
 * @param beznyUcet ucet na ktory pridu peniaze
 */
	public void vlozNaUcet(int ciastka, BeznyUcet beznyUcet) {

		cislo += ciastka;
		beznyUcet.setVklad(ciastka);
		setVyber(ciastka);

	}
	/**
	 * vracia zostatok
	 */

	public double getZostatok() {
		vysledokBezUrokom = super.getZostatok() - cislo;

		return super.getZostatok();
	}
	/**
	 * vklada na terminovany ucet ciastku a odobera ju zo sporiaceho uctu
	 * @param ciastka ciastka penazi
	 * @param terminovanyUcet ucet na ktory pridu peniaze
	 */

	public void vlozNaUcet(int ciastka, TerminovanyUcet terminovanyUcet) {
		cislo += ciastka;
		terminovanyUcet.setVklad(ciastka);
		SporiaciUcet.super.setVyber(ciastka);
	}
/**
 * zapisuje urok ktory je udany v konstruktore
 */
	public void zapisUrok() {

		aktualnyZostatok = getZostatok() * urokovaSadzba / 100;
		setVklad(aktualnyZostatok);

	}
	/**

	public double getZostatokSurokom() {
		return aktualnyZostatok + getZostatok();
	}*/
}
