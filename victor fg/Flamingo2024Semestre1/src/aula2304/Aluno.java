package aula2304;

public class Aluno {
	private String nome;
	private int idade;
	private double nota;
		
	public Aluno (String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
		public String getNome () {
			return nome;
		}
		public void setNome (String newNome) {
			this.nome = newNome;
		}
		public int getIdade () {
			return idade;
		}
		public void setIdade (int newIdade) {
			this.idade = newIdade;
		}
		public double getNota () {
			return nota;
		}
		public void setNota (double newNota) {
			this.nota = newNota;
		}
}
