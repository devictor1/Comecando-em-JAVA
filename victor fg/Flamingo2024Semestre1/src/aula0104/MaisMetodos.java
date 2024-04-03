package aula0104;

import java.util.Scanner;

public class MaisMetodos {
	static void cadastro(String primeiroNome, String ultimoNome, int idade, String comidaFavorita) {
		System.out.println("Seu nome é " + primeiroNome + " " + ultimoNome);
		System.out.println("Sua idade é de " + idade + " anos");
		System.out.println("E sua comida favorita é a " + comidaFavorita);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String pNome;
		String uNome;
		int idade;
		String cFav;
		
		System.out.println("Escreva seu nome e um sobrenome amigo");
		pNome = sc.next();
		uNome = sc.next();
				
		System.out.println("Agora me diga sua idade");
		idade = sc.nextInt();
		
		System.out.println("Por último, qual sua comida favorita?");
		cFav = sc.next();
		
		cadastro(pNome, uNome, idade, cFav);
		
		sc.close();
		}

}
