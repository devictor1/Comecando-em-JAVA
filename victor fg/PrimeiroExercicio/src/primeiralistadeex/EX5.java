package primeiralistadeex;

import java.util.Scanner;

public class EX5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque um número abaixo");
	int valor = sc.nextInt();
	
	System.out.println("Coloque outro número abaixo");
	int valor2 = sc.nextInt();
	
	int resultado = valor * valor2;
	
	System.out.println("A multiplicação dos números é: " + resultado);
	
	sc.close();
	
}
}
