package homework;

import java.util.Scanner;

public class TicketAutomatTest {

	public static void main(String[] args) {

		String k, K;

		Scanner sc = new Scanner(System.in);
		System.out.println("Tarifzone: K -  1,40€.");
		System.out.println("Tarifzone: A -  2,30€.");
		System.out.println("Tarifzone: B -  4,70€.");
		System.out.println("Tarifzone: C -  9,60€.");
		System.out.println("Tarifzone: D - 11,40€.");
		System.out.println("Bitte geben Sie die gewünschte Tarifzone an.");
		String auswahl = sc.next();
		System.out.println("Ausgewählter Tarif: " + auswahl);
		

			while (true) {
				if (auswahl == "k" || auswahl == "K") {
					double betrag = 1.40;
					System.out.println("bitte " + betrag + " Eur einwerfen");
				double zwischensumme = sc.nextInt();
				double ueberschuss = zwischensumme - betrag;
				double rest = betrag - zwischensumme;
				if (zwischensumme > betrag) {

					System.out.println(
							"Ihr ticket wird gedruckt und entnehmen Sie Ihr " + ueberschuss + " Eur Wechselgeld ");
				} else if (zwischensumme < betrag) {

					System.out.println("Bitte noch " + rest + " Eur einwerfen.");

				} else if (rest == 0) {
					System.out.println("Ticket wird gedruckt");
					break; // Schleife wird abgebrochen
				}
			}
		}
	}

}
