package aula1403;

import java.util.Scanner;

public class IfTernarioIfTernario {
	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("Coloque a sua idade amigo");

				int idade = sc.nextInt();

				String saida;

				saida = idade < 16 ? "Rapaz, você não pode votar" : idade < 18 ? "Você pode votar, se quiser" : "VÁ VOTAR AGORA";

				System.out.println(saida);

			} catch (Exception e) {
				System.out.println("Me desculpe mas apenas números são aceitos!");

			} finally {
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Deseja continuar?");
			resposta = sc.next();
			if (!(resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
					|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
					|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S"))) {
				System.out.println("Obrigado por utilizar nossos serviços!");
				sc.close();
			}

		}

	}

}
