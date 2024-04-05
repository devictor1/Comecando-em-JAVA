package aula0404;

public class MethodOverload {
	
	static int metodoSoma (int x, int y) {
		return x + y;
	}
	static float metodoSoma (float x, float y) {
		return x + y;
	}
	static double metodoSoma (double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		int numero1 = metodoSoma(2, 5);
		float numero2 = metodoSoma(2.121f,7.2f);
		double numero3 = metodoSoma(2.324235234, 27.345346);
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
	}

}
