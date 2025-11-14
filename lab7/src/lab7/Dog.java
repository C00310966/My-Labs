/* 
 * Name: Cian Howard
 * Date: 14/11/2025*/
package lab7;

public class Dog extends Animal {
	
	 	public Dog(String type,int age, char gender) //super passes data into superclass constructor
	 	{
	        super(type, age, gender);
	    }

	    @Override
	    public void eat() 
	    {
	        System.out.println("Dog eats nuts");
	    }

	    @Override
	    public void sleep()
	    {
	        System.out.println("Dog sleeps on bed");
	    }

	    @Override
	    public void makeSound() 
	    {
	        System.out.println("Dog barks");
	    }
	

}
