package sk.richard.refaktor;

public class BeznyUcet extends BankovyUcet {
	final static private int poplatkyZaVedenieUctu = 5;
	private double vysledokPoPoplatku;
	private int pocetVolani;
	private double vysledokPredPoplatkom;

	public BeznyUcet(double zostatok) {
		super(zostatok);

	}

	public void vyber(int ciastka) {

		super.setVyber(ciastka);

	}
	/**
	 * vracia zostatok ak je volana bez uctovania poplatkov vrati klasicky zostatok
	 * ak  bol zauctovany poplatok vracia novy zostatok
	 */

	public double getZostatok() {
		if (pocetVolani < 1) {
			vysledokPredPoplatkom = super.getZostatok();
			return super.getZostatok();

		}

		else
			return vysledokPoPoplatku;
	}

// poplatky za vednie ustu su 5 Euro mesacne
	public void zauctujPoplatky() {
		pocetVolani++;
		vysledokPoPoplatku = vysledokPredPoplatkom - poplatkyZaVedenieUctu;

	}

}
