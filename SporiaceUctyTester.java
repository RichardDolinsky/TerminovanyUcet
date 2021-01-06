package sk.richard.refaktor;

public class SporiaceUctyTester {

	public static void main(String[] args) {

		SporiaciUcet sporiaciUcet = new SporiaciUcet(5);
		BeznyUcet beznyUcet = new BeznyUcet(1000);
		TerminovanyUcet terminovanyUcet = new TerminovanyUcet(10, 3); // mesiace a percenta

		sporiaciUcet.vloz(10000); // vkladam 10 000
		// System.out.println(sporiaciUcet.getZostatok() + " suma na sporiacom ucte");
		// System.out.println(beznyUcet.getZostatok()+ " suma na beznom ucte");

		sporiaciUcet.vlozNaUcet(2000, beznyUcet); // zo sporiaceho sa odobera 2000 a prida na bezny ucet = 8000
		System.out.println(beznyUcet.getZostatok() + " suma na beznom ucte"); // pripocita 2000 na 1000 ucte je to 3000

		beznyUcet.vyber(1500);
		beznyUcet.vyber(80); // 3 000 - 1580 = 1420

		System.out.println(beznyUcet.getZostatok() + " suma na beznom ucte po vybere ");
		System.out.println(sporiaciUcet.getZostatok() + " suma na sporiacom ucte  , ma byt 8000");

		sporiaciUcet.vlozNaUcet(1000, beznyUcet); // zo sporiaceho 8 000 - 1 000 = 7 000
		beznyUcet.vyber(400); // 1420-400+1000 = 2020 zostatok
		System.out.println(sporiaciUcet.getZostatok() + " suma na sporiacom ucte  +");
		System.out.println(beznyUcet.getZostatok() + " suma na beznom ucte po vybere ");
		System.out.println(" ");

		sporiaciUcet.vlozNaUcet(3000, terminovanyUcet);
		System.out.println(sporiaciUcet.getZostatok() + " suma na sporiacom ucte ");
		System.out.println(terminovanyUcet.getZostatok() + " suma na terminovanom");
		terminovanyUcet.vyber(400); // netreba zabudnut na pokutu
		System.out.println(terminovanyUcet.getZostatok() + "suma po vybere na terminovanom ");

		// nasimulujte koniec mesiaca
		sporiaciUcet.zapisUrok();
		terminovanyUcet.zapisUrok();
		beznyUcet.zauctujPoplatky();

		// vypiste aktualne zosatky na jednotlivych uctov a ocakavane hodnoty
		System.out.println(" ");

		System.out.println("Zostatok na beznom ucte po stiahnuti poplatkov: " + beznyUcet.getZostatok());
		System.out.println("Ocakavana hodnota: zostatok - 5 Eur  = 2015 Eur");
		//System.out.println("Zostatok na sporiacom ucte: " + sporiaciUcet.getZostatokSurokom());
		System.out.println("Zostatok na sporiacom ucte: " + sporiaciUcet.getZostatok());
		System.out.println("Ocakavana hodnota: 4200");
		System.out.println("Zostatok na terminovanom ucte: " + terminovanyUcet.getZostatok());
		System.out.println("Ocakavana hodnota: 2661,52");

	}

}
