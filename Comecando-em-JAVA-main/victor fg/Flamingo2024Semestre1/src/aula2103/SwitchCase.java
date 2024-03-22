package aula2103;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que dia da semana é hoje? Responda de 1 a 7");
		int numero = sc.nextInt();

		switch (numero) {
		
		case 1:
			System.out.println("Domingou");
			break;
		case 2:
			System.out.println("Segundou");
			break;
		case 3:
			System.out.println("Terçou");
			break;
		case 4:
			System.out.println("Quartou");
			break;
		case 5:
			System.out.println("Quintou");
			break;
		case 6:
			System.out.println("Sextou");
			break;
		case 7:
			System.out.println("Sabadou");
			break;
		default:
			System.out.println("ERRRROOOOUUUU");
			break;
		


	}
		sc.close();

	}}
