package lab4;

import java.util.Scanner;

public class MyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //used scanner take inputs
		int menu = 0;
		Office[] offices = new Office[3]; //creates array to store offices
		Employee[] employees = new Employee[5]; //create array to store employees
		int employeeCount = 0;
		
		
		for(int i =0; i < offices.length; i++) //Creates 3 office instances and adds them to array of offices
		{
			Office ofc = new Office();
			offices[i] = ofc;
		}
		
		System.out.println("Select one of the options below: ");
		System.out.println("1. List all offices");
		System.out.println("2. Create a new employee record");
		System.out.println("3. List all employees");
		System.out.println("4. Exit Sytem");
		System.out.println(" ");
		System.out.println("Enter an option: ");
		menu = input.nextInt();
		
		while (menu != 4)//Loops as long as option four is not entered to exit
		{
			switch (menu){
				case 1:
					for(Office ofc: offices) { //iterates through the offices, printing the number of employees and employee details
						System.out.println(ofc + " " +"No. Of Employees: " + ofc.getNoOfEmpInOffice()); //calls method for number of employees in an office
						if (ofc.getNoOfEmpInOffice() != 0)
						{
							System.out.println("Employees: " + "\n" + ofc.printEmpInOff());
						}
					}
				break;
					
				case 2:
					if (employeeCount < employees.length)
					{
							String name; //uses local variables to enter data into constructors
							String employeeType;
							String street;
							String city;
							String county;
							String carManufacturer = null;
							
							Scanner empInfo = new Scanner(System.in); 
							System.out.println("Enter employee name: ");
							name = empInfo.nextLine();
							System.out.println("Enter employee type (Manager / Staff): ");
							employeeType = empInfo.nextLine();
							System.out.println("Enter street: ");
							street = empInfo.nextLine();
							System.out.println("Enter city: ");
							city = empInfo.nextLine();
							System.out.println("Enter county: ");
							county = empInfo.nextLine();
							if(employeeType.equalsIgnoreCase("Manager")) 
								{
									System.out.println("Enter car manufacturer: ");
									carManufacturer = empInfo.nextLine();
								}
							
							Address address = new Address(street, city, county);
							Employee newEmp = new Employee(employeeType, name, address);//creates an employee
							newEmp.setCarManufacturer(carManufacturer);
							employees[employeeCount] = newEmp; //adds the newly created employee to the array of employees
							employeeCount++;
							
							for(Office ofc: offices) //iterates through array of offices
							{
								if(ofc.getNoOfEmpInOffice() <= 2) //as long as there are not more than 2 employees in an office we can add a new employee
								{
									ofc.addEmp(newEmp);//adds the new employee to the office
									break;
								}
							}
						}
							
					else {
								System.out.println("Max number of employees reached!");
							}
							
				break;
					
				case 3:
					for(Employee emp: employees) //iterates through employees in employee array
					{
						if(emp != null)
						{
							System.out.println(emp); //prints out employee details
						}
					}
				
				
			}
			
			System.out.println("\nSelect one of the options below:");
		    System.out.println("1. List all offices");
		    System.out.println("2. Create a new employee record");
		    System.out.println("3. List all employees");
		    System.out.println("4. Exit System");
		    System.out.print("Enter an option: ");
		    menu = input.nextInt();
		}
		

	}
}

