package aula1103;

import java.util.Scanner;

public class Meses {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Coloca o numeral correspondente ao seu mês de aniversário");
	
	int mes = sc.nextInt();
	
	
	
	while (mes < 0 || mes > 12) {
		
		if        (mes==1){
			System.out.println("Nasceu em Janeiro tome");
		} else if (mes==2){
			System.out.println("Nasceu em Fevereiro tome");
		} else if (mes==3){ 
			System.out.println("Nasceu em Março tome");		
		} else if (mes==4){ 
			System.out.println("Nasceu em Abril tome");		
		} else if (mes==5){ 
			System.out.println("Nasceu em Maio tome");		
		} else if (mes==6){ 
			System.out.println("Nasceu em Junho tome");		
		} else if (mes==7){ 
			System.out.println("Nasceu em Julho tome");		
		} else if (mes==8){ 
			System.out.println("Nasceu em Agosto tome");		
		} else if (mes==9){ 
			System.out.println("Nasceu em Setembro tome");		
		} else if (mes==10){ 
			System.out.println("Nasceu em Outubro tome");		
		} else if (mes==11){ 
			System.out.println("Nasceu em Novembro tome");		
		} else if (mes==12){ 
			System.out.println("Nasceu em Dezembro tome");		
		} else {
			System.out.println("Eai tio, ta tirando? Coloca o mês ai");
			}

	}
	
	
	sc.close();
}
}
