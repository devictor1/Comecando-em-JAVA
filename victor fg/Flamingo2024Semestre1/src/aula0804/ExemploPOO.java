package aula0804;

public class ExemploPOO {
	double altura = 1.74;
	String name = "Gus";
	float peso = 73.5f;
	
	public static void main(String[] args) {
		
		ExemploPOO objeto1= new ExemploPOO();
		ExemploPOO objeto2= new ExemploPOO();
		ExemploPOO objeto3= new ExemploPOO();
		
		System.out.println(objeto1.name);
		System.out.println(objeto1.name +" "+ objeto2.altura);
		System.out.println(objeto1.name +" "+ objeto2.altura + " " + objeto3.peso);
	}

}
