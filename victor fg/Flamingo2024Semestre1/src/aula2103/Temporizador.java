package aula2103;

public class Temporizador {
	public static void main(String [] args) {
		
		for (int minutos = 59; minutos < 60; minutos--) {
			for (int segundos = 59; segundos < 60; segundos--) {
				System.out.println(minutos + " : " + segundos);
				try {
                    Thread.sleep(1000); // Aguarda 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}