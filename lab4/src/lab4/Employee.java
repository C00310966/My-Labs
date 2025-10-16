package lab4;

public class Employee {
	private static int employeeNumber = 999;
	private int employeeNo;
	private String employeeType;
	private int noOfEmployee;
	private Address address;
	private String name;
	
	private String carManufacturer;
	
	private Employee[] employees = new Employee[5];
	
	

	public Employee(String employeeType, String name, int noOfEmployee, Address address) {
		super();
		this.employeeNo = employeeNumber + 1;
		this.employeeType = employeeType;
		this.name = name;
		this.address = address;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public void addEmployee(Employee emp) //method for adding an employee to array of employees
	{
		if (getNoOfEmployee() >= 0 && getNoOfEmployee() < 5) //first checks that the users number of accounts is not greater than 3
		{
				employees[getNoOfEmployee()] = emp;//adds the new account in the array at the specified number
				setNoOfEmployee(getNoOfEmployee()+1); //increments the count of accounts
		}
		else 
		{
			System.out.print("Max number of employees reached!!");
		}
	}
		
		public String getCarManufacturer() {
			return carManufacturer;
		}


		public void setCarManufacturer(String carManufacturer) {
			this.carManufacturer = carManufacturer;
		}

		@Override
		public String toString() {
			if(employeeType == "Manager") {
				return "Employee [employeeNo=" + employeeNo + ", employeeType=" + employeeType + ", address=" + address
						+ ", name=" + name + ", carManufacturer=" + carManufacturer + "]";
		}
			else {
				return "Employee [employeeNo=" + employeeNo + ", name=" + name + " , employeeType=" + employeeType + ", address=" + address  + "]";
			}

		
		
	}
}
	
	

