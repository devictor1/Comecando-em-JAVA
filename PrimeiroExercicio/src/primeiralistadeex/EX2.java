package primeiralistadeex;

import java.util.Scanner;

public class EX2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque um número abaixo");
	int valor = sc.nextInt();
	
	int resultado = valor - 1;
	
	System.out.println("O número antecessor é: " + resultado);
	
	sc.close();
	
}
}
