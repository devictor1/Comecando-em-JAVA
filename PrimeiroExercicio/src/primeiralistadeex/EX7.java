package primeiralistadeex;

import java.util.Scanner;

public class EX7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque o valor da base do retângulo abaixo");
	float valor = sc.nextFloat();
	
	System.out.println("Coloque o valor da altura do retângulo abaixo");
	float valor2 = sc.nextFloat();
	
	float resultado = valor * valor2;
	
	System.out.println("A área do seu retângulo é: " + resultado);
	
	sc.close();
	
}
}
