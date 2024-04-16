package aula1504;

public class Celular {
	float preco;
	String nome;
	String marca;
	String tamanhoDeTela;

	public Celular () {
		preco = 3999.90f;
		nome = "Galaxy S23+";
		marca = "Samsung";
		tamanhoDeTela = "6.6 polegadas";
				
	}
	public static void main(String[] args) {
		Celular s23 = new Celular();
		System.out.println("O preço do " + s23.nome +  ", da marca " + s23.marca + ", é de " + 
		s23.preco + " reais, com tamanho de " + s23.tamanhoDeTela);

	}

}
