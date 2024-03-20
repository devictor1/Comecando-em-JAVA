package teste;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		float valor = sc.nextFloat();
		
		System.out.println("Saca o próximo número");
		float valor2 = sc.nextFloat();
		
		float resultado = valor / valor2;
		
		System.out.println(resultado);
	}
}
