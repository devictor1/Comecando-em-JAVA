package aula1103;

import java.util.Scanner;

public class Meses {
	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Coloque o numeral correspondente ao seu mês de aniversário");

				int mes = sc.nextInt();

				if (mes == 1) {
					System.out.println("Nasceu em Janeiro");
				} else if (mes == 2) {
					System.out.println("Nasceu em Fevereiro");
				} else if (mes == 3) {
					System.out.println("Nasceu em Março");
				} else if (mes == 4) {
					System.out.println("Nasceu em Abril");
				} else if (mes == 5) {
					System.out.println("Nasceu em Maio");
				} else if (mes == 6) {
					System.out.println("Nasceu em Junho");
				} else if (mes == 7) {
					System.out.println("Nasceu em Julho");
				} else if (mes == 8) {
					System.out.println("Nasceu em Agosto");
				} else if (mes == 9) {
					System.out.println("Nasceu em Setembro");
				} else if (mes == 10) {
					System.out.println("Nasceu em Outubro");
				} else if (mes == 11) {
					System.out.println("Nasceu em Novembro");
				} else if (mes == 12) {
					System.out.println("Nasceu em Dezembro");
				} else {
					System.out.println("Esse não é um valor válido! Favor inserir um número de 1 a 12");
				}

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
