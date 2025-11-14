/* 
 * Name: Cian Howard
 * Date: 14/11/2025*/
package lab7;

public class Animal {
	
	private String type;
	private int age;
	private char gender;
	
	public Animal(String type, int age, char gender) {
		this.type = type;
		this.age = age;
		this.gender = gender;
	}
	
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	
	public void makeSound()
	{
		System.out.println("A generic animal sound");
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]";
	}

	
	
}
