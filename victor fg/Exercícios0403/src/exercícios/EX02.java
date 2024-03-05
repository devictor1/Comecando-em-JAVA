package exercícios;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira quantos eleitores residem na sua cidade: ");
		int eleitores = sc.nextInt();
		
		System.out.print("Insira quantos eleitores votaram branco na sua cidade: ");
		int votosBrancos = sc.nextInt();
		
		System.out.print("Insira quantos eleitores votaram nulo na sua cidade: ");
		int votosNulos = sc.nextInt();
		
		System.out.print("Insira a quantidade de votos válidos na sua cidade: ");
		int votosValidos = sc.nextInt();
		
		
				
sc.close();
	}

}