package piramide;

import java.util.Scanner;

public class MuestraPiramide {

	public static void main(String[] args) {
		
		int altura = 5;
		char simbolo = '*';
		
		System.out.println("Una piramide de 5 pisos con asteriscos:");
		mostrarPiramide(altura, simbolo);
		
		//5.1. Pide al usuario que introduzca una letra y una altura
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una letra o simbolo:");
		simbolo = in.next().charAt(0);
		
		System.out.println("Introduce una altura:");
		altura = in.nextInt();
		
		//5.2. Crea un objeto piramide con los datos introducidos
		Piramide piramide = new Piramide(altura, simbolo);
		
		//5.3. Llama al metodo toString de la clase piramide
		System.out.println(piramide.toString());
		

	}

	private static void mostrarPiramide(int altura, char simbolo) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
	}

}
