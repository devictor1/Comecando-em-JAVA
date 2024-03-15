package projeto;

import java.util.Scanner;

public class FlamingoFintech {
	public static void main(String[] args) {
		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {
			try {
				Scanner sc = new Scanner(System.in);

				int numeroConta;
				float saldo = 0;
				
				
				
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~Flamingo Fintech!~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Seja bem-vindo!");
				System.out.println();
				System.out.println("Para acessar, digite seu usuário e senha");

				System.out.println("Digite abaixo o seu usuário");
				String usuario = sc.next().toLowerCase();

				System.out.println("Digite abaixo sua senha");
				String senha = sc.next();

				if (usuario.equals("relampago") && senha.equals("katchau")) {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~Flamingo Fintech!~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Login realizado com sucesso!");
					System.out.println();
					System.out.println("Selecione a opção desejada abaixo");
					System.out.println();
					System.out.println("1 - Depósitos");
					System.out.println("2 - Saques");
					System.out.println("3 - Transferências");
					System.out.println("4 - Saldo");
					System.out.println("5 - Pagamentos");
					System.out.println("6 - Empréstimos");
					System.out.println("7 - Sair");
					System.out.println();

					int opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Você escolheu a opção de Saldo!");
						System.out.println("Agora digite o número da sua conta");
						numeroConta = sc.nextInt();
						System.out.println("Agora digite a sua senha");
						senha = sc.next();
						System.out.println("O saldo da conta " + numeroConta + " é de " + saldo);
						break;
					case 2:
						System.out.println("Você escolheu a opção de Saques!");
						break;
					case 3:
						System.out.println("Você escolheu a opção de Depósitos!");
						break;
					case 4:
						System.out.println("Você escolheu a opção de Transferências!");
						break;
					}
				} else

				{
					System.out.println("VOCÊ NÃO É O MARQUINHOS, VAZA");
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
