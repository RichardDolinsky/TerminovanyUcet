package sk.richard.refaktor;

public class TerminovanyUcet extends BankovyUcet {
	int pocetMesiacov;
	int urokovaSadzba;
	double pocet;
	private double sumabezUrokom;
	private double sumaSurokom;

	public TerminovanyUcet(int pocetMesiacov, int urokovaSadzba) {
		super(0);
		this.urokovaSadzba = urokovaSadzba;
		this.pocetMesiacov = pocetMesiacov;

		// TODO Auto-generated constructor stub
	}
	// vybera ciastku a zohladnuje pokutu aj su mesiace viac ako 0

	public void vyber(int ciastka) {
		if (pocetMesiacov > 0) {
			pocet = ciastka / 25;
			super.setVyber(ciastka + pocet);
			// pocet = ciastka/25;
			// setVyber(pocet);
			System.out.println(pocet + " Eur pokuta");

		}
	}

	public double getZostatok() {
		sumabezUrokom = super.getZostatok();
		return super.getZostatok();

	}
	/**
	 * zapisuje urok a urok vklada na ucet
	 */

	public void zapisUrok() {

		sumaSurokom = sumabezUrokom * urokovaSadzba / 100;
		setVklad(sumaSurokom);

	}
	
/**
	public double getZostatokSurokom() {
		return sumaSurokom + sumabezUrokom;
	}
	*/

}
