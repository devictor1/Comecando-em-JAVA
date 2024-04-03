package aula0204;

import java.util.Scanner;

public class MetodoComIfElse {

	static void ageCheck(int age) {
		if (age < 16) {
			System.out.println("Ei amigo, você não pode votar!");
		} else if (age < 18 || age > 64) {
			System.out.println("Show meu querido, pode escolher se vota ou não");
		} else {
			System.out.println("VÁ VOTAR AGORAAAAAAAAAAAAAAAAAAAAAAAAAA");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;

		System.out.println("Por favor insira sua idade!");
		idade = sc.nextInt();

		ageCheck(idade);

		sc.close();
	}

}
