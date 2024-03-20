package aula1103;

import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloca sua idade ai mermão");
	int idade = sc.nextInt();
	
	if(idade<16) {
		System.out.println("Tu nem pode votar primo");
	} else if (idade<18) {
		System.out.println("Vota se quiser ta ligado");
	} else { 
		System.out.println("VAI VOTA PORRAAAAAAAAAAAAAAAAAAAAAAAAA");		
	}
	sc.close();
}
}
