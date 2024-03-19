package aula1803;

import java.util.Scanner;

public class Exercicio01while {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número do tipo inteiro, será exibida a tabuada"
				+ " do 1 ao 10 do número digitado.");
		int numero = sc.nextInt();
		int multiplicador = 1;
		
		while (multiplicador < 11) {
			System.out.print(numero * multiplicador + " ");
			multiplicador++;
		}
		
		
		sc.close();
	}
}
