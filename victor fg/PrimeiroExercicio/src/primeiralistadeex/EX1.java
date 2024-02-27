package primeiralistadeex;

import java.util.Scanner;

public class EX1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloque um número abaixo");
	int valor = sc.nextInt();
	
	int resultado = valor + 1;
	
	System.out.println("O número sucessor é: " + resultado);
	
	sc.close();
	
}
}
