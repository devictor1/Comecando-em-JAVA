package aula1803;

public class LacosDeRepeticao {

	public static void main(String[] args) {
		int contador = 0;

		while (contador < 8) {
			System.out.println("É o contas");
			contador = contador + 1;
			contador--; /* aqui foi -1 */
			contador++; /* aqui foi +1 */
		}
	}
}
