/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base,
e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
*/

package tarefa08;

public class EX06 {
	public static void main(String[] args) {
		int B = (int) (Math.random() * 101);
		int E = (int) (Math.random() * 101);
		int resultado = (int) Math.pow(B, E);

		System.out.println("O número " + B + " elevado à " + E + " é igual a " + resultado);

	}
}