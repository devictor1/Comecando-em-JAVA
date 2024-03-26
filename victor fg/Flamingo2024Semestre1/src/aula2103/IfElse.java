package aula2103;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número abaixo");
		int numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("Domingou");
		} else if (numero == 2) {
			System.out.println("Segundou");
		} else if (numero == 3) {
			System.out.println("Terçou");
		} else if (numero == 4) {
			System.out.println("Quartou");
		} else if (numero == 5) {
			System.out.println("Quintou");
		} else if (numero == 6) {
			System.out.println("Sextou");
		} else if (numero == 7) {
			System.out.println("Sabadou");
		} else {
			System.out.println("Não há dia da semana correspondente!");
		}

		sc.close();

	}

}
