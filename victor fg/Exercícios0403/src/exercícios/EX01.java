package exercícios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira quantos anos você tem, quantos meses se passaram desde o seu último aniversário, e qual o dia de hoje: ");
		short ano = sc.nextShort();
		byte mes = sc.nextByte();
		byte dia = sc.nextByte();
		int anodia = (ano * 365);
		int mesdia = (mes * 30);
		
		int resultado = (anodia + mesdia + dia);
		
		System.out.println("Sua idade em dias é: " + resultado);
		
		
		
		
				
sc.close();
	}

}
