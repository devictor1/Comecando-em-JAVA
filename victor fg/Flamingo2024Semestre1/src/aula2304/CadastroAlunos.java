package aula2304;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {
		
	public static void main(String[] args) {
		ArrayList<Aluno> cadastroAluno = new ArrayList<Aluno>();
		int opcao;
		Scanner sc =  new Scanner(System.in);
		
		while(true) {
			System.out.println("Menu de cadastro:");
			System.out.println("1 - Cadastrar um aluno");
			System.out.println("2 - Mostrar todos os alunos");
			System.out.println("3 - Sair");
			System.out.println("Digite a opção escolhida:");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Opção escolhida: 1");
				System.out.println("Digite o nome do aluno!");
				String nome = sc.next();
				System.out.println("Agora, digite a idade dele:");
				int idade = sc.nextInt();
				System.out.println("Por último, qual foi a nota que o aluno tirou?");
				double nota = sc.nextDouble();
			
				Aluno aluno = new Aluno(nome, idade, nota);
				cadastroAluno.add(aluno);
				System.out.println("Aluno cadastrado com sucesso!");
			}else if (opcao == 2) {
				System.out.println("Opção escolhida: 2");
				for (Aluno aluno:cadastroAluno) {
					System.out.println(aluno);
					}
			}else if (opcao == 3) {
				System.out.println("Opção escolhida: 3");
				System.out.println("Saindo da página de cadastro.");
				break;
			}else {
				System.out.println("Opção inválida! Tente novamente");
			}
			}
		sc.close();

	}
}

