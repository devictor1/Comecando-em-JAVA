/*Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo.
A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc.
Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja 
ormado o próximo valor da seqüência.
Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
*/
package tarefa08;

public class EX07 {
	public static void main(String[] args) {
		int B = (int) (Math.random() * 101);
		int E = (int) (Math.random() * 101);
		int resultado = (int) Math.pow(B, E);

		System.out.println("O número " + B + " elevado à " + E + " é igual a " + resultado);

	}
}