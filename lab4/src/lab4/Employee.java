package lab4;

public class Employee {
	private static int employeeNumber = 999;//use static variable to assign id numbers
	private int employeeNo;
	private String employeeType;
	private Address address;
	private String name;
	
	private String carManufacturer;
	

	public Employee(String employeeType, String name, Address address) { //calls address object to assign an employees address
		this.employeeNo = employeeNumber + 1;
		employeeNumber++;
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
	
	

