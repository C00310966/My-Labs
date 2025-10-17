package lab4;

public class Office {

	private static int officeNumber = 99;//static variable used to assign offices numbers
	private int noOfEmpInOffice = 0; //counts employees in an office
	private int officeNo;
	private Employee[] empInOffice = new Employee[2];
	
	public Office() //constructor
	{
		this.officeNo = officeNumber +1;
		officeNumber = officeNumber +1;
	}
	
	//getters and setters
		public int getNoOfEmpInOffice() {
		return noOfEmpInOffice;
	}

	public void setNoOfEmpInOffice(int noOfEmpInOffice) {
		this.noOfEmpInOffice = noOfEmpInOffice;
	}

	//other methods
	public void addEmp(Employee emp) {
		if(getNoOfEmpInOffice() >= 0 && getNoOfEmpInOffice() < 2) {//iterates through office array adding employees yntil full
			empInOffice[getNoOfEmpInOffice()] = emp;
			setNoOfEmpInOffice(getNoOfEmpInOffice() + 1);
		}
		else
		{
			System.out.print("Max number of employees assigned to Office");
		}	
	}
	
	public String printEmpInOff() {
		String empRecord = "";
		for(Employee emp: empInOffice) {
			if(emp!=null) {
				empRecord += emp.getEmployeeNo() + ",   " +  emp.getName() + "\n";
			}
		}
		return empRecord;
	}

	//toString
	@Override
	public String toString() {
		return "Office [officeNo=" + officeNo + "]";
	}
	
	
	
}
