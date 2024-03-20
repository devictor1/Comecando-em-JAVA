package aula1403;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Que dia da semana é hoje? Responda de 1 a 7");
				int dia = sc.nextInt();
				
				switch(dia) {
				case 1:
					System.out.println("Domingo, deixa um gosto amargo na boca");
					break;
				case 2:
					System.out.println("Vish já é segunda de novo");
					break;
				case 3:
					System.out.println("Terça.... só começou....");
					break;
				case 4:
					System.out.println("Meio da semana, mas é uma quarta 1/4?");
					break;
				case 5:
					System.out.println("Hoje é quinta, já já tem hein");
					break;
				case 6:
					System.out.println("SEXTOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOUUUUUUUUUUU");
					break;
				case 7:
					System.out.println("SABADAMOSSSSSS");
					break;
															
				}
								
			} catch (Exception e) {
				System.out.println("Me desculpe mas esse não é um valor válido!");

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
