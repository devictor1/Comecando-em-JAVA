package aula1504;

import java.util.Scanner;

public class CelularConstrutor02 {
	float preco;
	String nome;
	String marca;
	float tamanhoDeTela;

	public CelularConstrutor02 (float preco1, String nome1, String marca1, float tamanhoDeTela1) {
		preco = preco1;
		nome = nome1;
		marca = marca1;
		tamanhoDeTela = tamanhoDeTela1;
				
	}
	public static void main(String[] args) {
		float preco;
		String nome;
		String marca;
		float tamanhoDeTela;
		Scanner sc = new Scanner (System.in);
		System.out.println("Bem-vindo! Insira abaixo os valores requisitados:");
		System.out.println("Insira o modelo do seu celular!");
		nome = sc.next();
		System.out.println("Agora, insira o preço dele.");
		preco = sc.nextFloat();
		System.out.println("Insira agora a marca deste celular");
		marca = sc.next();
		System.out.println("Por último, insira o tamanho da tela, em polegadas");
		tamanhoDeTela = sc.nextFloat();
				
		CelularConstrutor02 novoCel = new CelularConstrutor02(preco, nome, marca, tamanhoDeTela);
		
		System.out.println("O preço do " + novoCel.nome +  ", da marca " + novoCel.marca + ", é de " + 
			novoCel.preco + " reais, com tamanho de " + novoCel.tamanhoDeTela + " polegadas.");
sc.close();
	}

}
