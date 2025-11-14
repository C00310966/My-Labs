/* 
 * Name: Cian Howard
 * Date: 14/11/2025*/
package lab7;

public class Cat extends Animal {

	public Cat(String type,int age, char gender) 
 	{
        super(type, age, gender);//super passes data into superclass constructor
    }

    @Override
    public void eat() 
    {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep()
    {
        System.out.println("Cat sleep in box");
    }

    @Override
    public void makeSound() 
    {
        System.out.println("Cat meows");
    }
	
}
