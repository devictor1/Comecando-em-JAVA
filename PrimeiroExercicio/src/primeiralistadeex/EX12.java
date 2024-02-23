package primeiralistadeex;

import java.util.Scanner;

public class EX12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque o valor do raio do círculo abaixo");
	float valor = sc.nextFloat();	
	
	float resultado = valor * valor;
	double resultado2 = resultado * 3.14;
	
	System.out.println("A área do seu círculo é: " + resultado2);
	
	sc.close();
}
}