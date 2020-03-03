package homework;

import java.util.Scanner;

public class TempRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Eingabe durch den Benutzer über die Konsole
		System.out.println("Bitte geben Sie eine Temperatur ein.");
		double celsius = sc.nextDouble();
		System.out.println(celsius + " Grad Celsius" );
		double fahrenheit = (celsius * 9/5 ) + 32; // Nutze ich die Formel in der PDF kommt nur Murx raus 
		System.out.println(fahrenheit + " Grad Fahrenheit" );
				
		sc.close(); 
		
	}

}
