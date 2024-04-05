package aula0404;

public class MetodoComIfElse {
	public static void main(String[] args) {
		int resultado = soma(10);
		System.out.println(resultado);
	}
	static int soma (int x) {
		if (x > 0) {
			return x + soma(x - 1);
			} else {
			return 0;
		}
	}
}
