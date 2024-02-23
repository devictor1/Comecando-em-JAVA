package primeiralistadeex;

import java.util.Scanner;

public class EX9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque o valor do lado do quadrado abaixo");
	float valor = sc.nextFloat();
		
	float resultado = valor * valor;
	
	System.out.println("A área do seu quadrado é: " + resultado);
	
	sc.close();
	
}
}