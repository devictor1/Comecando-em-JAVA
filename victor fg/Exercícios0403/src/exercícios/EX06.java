package exercícios;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor da temperatura em Fahrenheit: ");
		float gFahr = sc.nextFloat();
		float gCels = ((gFahr - 32) / 1.8f);
		System.out.println("Este é o valor da temperatura em Celsius: " + gCels);
		
		
				
sc.close();
	}

}
