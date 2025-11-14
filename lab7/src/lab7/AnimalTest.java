/* 
 * Name: Cian Howard
 * Date: 14/11/2025*/
package lab7;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

		Vet v1 = new Vet("Dave"); //creates new vet object
		
		v1.vaccinate(dog); //passes dog object into vaccinate
		System.out.println();
		v1.vaccinate(cat);
		}
}
