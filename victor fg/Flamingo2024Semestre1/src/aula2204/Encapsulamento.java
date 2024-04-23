package aula2204;

public class Encapsulamento {
	private int age;
	private String name;
	private float height;
	
	public int getAge () {
		return age;
	}
	public void setAge (int newAge) {
		this.age = newAge;
	}
	public String getName () {
		return name;
	}
	public void setName (String newName) {
		this.name = newName;
	}
	public float getHeight () {
		return height;
	}
	public void setHeight (float newheight) {
		this.height = newheight;
	}
}