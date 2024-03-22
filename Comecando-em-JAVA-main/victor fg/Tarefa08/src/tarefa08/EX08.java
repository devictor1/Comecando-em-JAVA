/* Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit,
 * de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
 * O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = (9*C +160) /5,
 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius
*/
package tarefa08;

public class EX08 {
	public static void main(String[] args) {
		int B = (int) (Math.random() * 101);
		int E = (int) (Math.random() * 101);
		int resultado = (int) Math.pow(B, E);

		System.out.println("O número " + B + " elevado à " + E + " é igual a " + resultado);

	}
}