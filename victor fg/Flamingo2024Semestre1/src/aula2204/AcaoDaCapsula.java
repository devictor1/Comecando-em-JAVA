package aula2204;

public class AcaoDaCapsula {

	public static void main(String[] args) {
		Encapsulamento newCaps = new Encapsulamento();
		newCaps.setName("John");
		newCaps.setAge(32);
		newCaps.setHeight(1.79f);
		System.out.println(newCaps.getName() + " " + newCaps.getAge() + " " + newCaps.getHeight());
	}

}
