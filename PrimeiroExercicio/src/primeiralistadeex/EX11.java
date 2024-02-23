package primeiralistadeex;

import java.util.Scanner;

public class EX11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque o valor da base maior do trapézio abaixo");
	float valor = sc.nextFloat();
	
	System.out.println("Coloque o valor da base menor do trapézio abaixo");
	float valor2 = sc.nextFloat();
	
	System.out.println("Coloque o valor da altura do trapézio abaixo");
	float valor3 = sc.nextFloat();
	
	float resultado = valor + valor2;
	float resultado2 = resultado * valor3;
	float resultado3 = resultado2 / 2;
	
	System.out.println("A área do seu trapézio é: " + resultado3);
	
	sc.close();
	
}
}