package Q2;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] people = new Person[2];

        people[0] = new Employee("Mary", 60000.00);
        people[1] = new Student("Pat", "Software Development");

        for (Person p : people) {
            System.out.println("Name: " + p.getName());
            System.out.println("Description: " + p.getDescription());
            System.out.println();
        }
		
	}

}
