package exercícios;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor da temperatura em Celsius: ");
		float gCels = sc.nextFloat();
		float gFahr = ((gCels * 9 + 160) / 5);
		System.out.println("Este é o valor da temperatura em Fahrenheit: " + gFahr);
		
		
				
sc.close();
	}

}
