package aula2603;

public class ExemploMatrizFor {
 public static void main (String[] args) {
	 int [][] meusNumeros = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
	 
	 for (int i = 0; i < meusNumeros.length; ++i) {
		 for (int j = 0; j < meusNumeros[i].length; ++j) {
			 System.out.println(meusNumeros[i][j]);
		 }
	 }
	 
	
 }
}
