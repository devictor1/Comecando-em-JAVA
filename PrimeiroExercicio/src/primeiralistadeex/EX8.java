package primeiralistadeex;

import java.util.Scanner;

public class EX8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque o valor da base do triângulo abaixo");
	float valor = sc.nextFloat();
	
	System.out.println("Coloque o valor da altura do triângulo abaixo");
	float valor2 = sc.nextFloat();
	
	float resultado = valor * valor2;
	float resultado2 = resultado / 2;
	
	System.out.println("A área do seu triângulo é: " + resultado2);
	
	sc.close();
	
}
}