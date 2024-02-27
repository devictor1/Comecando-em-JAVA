package primeiralistadeex;

import java.util.Scanner;

public class EX10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque o valor da diagonal maior do losango abaixo");
	float valor = sc.nextFloat();
	
	System.out.println("Coloque o valor da diagonal menor do losango abaixo");
	float valor2 = sc.nextFloat();
	
	float resultado = valor * valor2;
	float resultado2 = resultado / 2;
	
	System.out.println("A área do seu losango é: " + resultado2);
	
	sc.close();
	
}
}