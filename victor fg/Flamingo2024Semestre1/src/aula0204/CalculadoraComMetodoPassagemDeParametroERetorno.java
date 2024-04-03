package aula0204;

import java.util.Scanner;

public class CalculadoraComMetodoPassagemDeParametroERetorno {
	static int soma(int x, int y) {
		return x + y;
	}
	static int subtracao(int x, int y) {
		return x - y;
	}
	static int multiplicacao(int x, int y) {
		return x * y;
	}
	static double divisao(int x, int y) {
		return x / y;
	}
	public static void main(String[] args) {
		
		int repetir = 1;
		int escolha;
		int numero1;
		int numero2;
		
		Scanner sc = new Scanner(System.in);
		
		while (repetir == 1) {
		System.out.println("Por favor escolha a sua operação:");
		System.out.println("1: Adição");
		System.out.println("2: Subtração");
		System.out.println("3: Multiplicação");
		System.out.println("4: Divisão");
		escolha = sc.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Agora, coloque o primeiro valor que você gostaria de somar");
			numero1 = sc.nextInt();
			System.out.println("Agora, coloque o segundo valor que você gostaria de somar");
			numero2 = sc.nextInt();
			System.out.println("O resultado da sua soma é: " + soma (numero1, numero2));
			break;
		case 2:
			System.out.println("Agora, coloque o primeiro valor que você gostaria de subtrair");
			numero1 = sc.nextInt();
			System.out.println("Agora, coloque o segundo valor que você gostaria de subtrair");
			numero2 = sc.nextInt();
			System.out.println("O resultado da sua subtração é: " + subtracao (numero1, numero2));
			break;
		case 3:
			System.out.println("Agora, coloque o primeiro valor que você gostaria de multiplicar");
			numero1 = sc.nextInt();
			System.out.println("Agora, coloque o segundo valor que você gostaria de multiplicar");
			numero2 = sc.nextInt();
			System.out.println("O resultado da sua multiplicação é: " + multiplicacao (numero1, numero2));
			break;
		case 4:
			System.out.println("Agora, coloque o primeiro valor que você gostaria de dividir");
			numero1 = sc.nextInt();
			System.out.println("Agora, coloque o segundo valor que você gostaria de dividir");
			numero2 = sc.nextInt();
			System.out.println("O resultado da sua divisão é: " + divisao (numero1, numero2));
			break;
		default:
			System.out.println("Opção inválida!");
		}
		System.out.println("Gostaria de repetir? Use 1 para sim e 2 para não");
		repetir = sc.nextInt();
		}
		sc.close();
	}

}
