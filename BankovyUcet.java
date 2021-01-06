package sk.richard.refaktor;

public class BankovyUcet {
	private double zostatok;
	private double vklad;
	double vyber;

	public BankovyUcet(double zostatok) {

		this.zostatok = zostatok;
		// zostatok=0;
	}

	public void pripisUrok(double urokovaSadzba) {

		zostatok = zostatok + ((urokovaSadzba * zostatok) / 100);
	}

	public double getVklad() {
		return vklad;
	}

	public void setVklad(double vklad) {
		this.vklad = vklad;
		zostatok = zostatok + vklad;
	}

	public double getVyber() {
		return vyber;
	}

	public void setVyber(double vyber) {
		this.vyber = vyber;
		zostatok = zostatok - vyber;
	}

	public double getZostatok() {
		return zostatok;
	}

	public void setZostatok(double zostatok) {
		this.zostatok = zostatok;
	}

}
