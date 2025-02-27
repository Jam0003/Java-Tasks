package task10;

public class Q2EmployeeSalary {

	int id;
	String firstName;
	String lastName;
	int salary;

	public Q2EmployeeSalary(int id, String firstName, String lastName, int salary) // Constructor with parameters
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getID() {
		return id;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}

	public int raiseSalary(int percent) {
		return (salary * 20 / 100) + salary;
	}

	@Override
	public String toString() {
		return "EmployeeQuest2" + "[Id=" + id + "," + "name=" + firstName + " " + lastName + "," + "salary=" + salary
				+ "]";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2EmployeeSalary objE = new Q2EmployeeSalary(1, "Jameel", "Mohamed", 50000);
		System.out.println("EMPLOYEE DETAILS ");
		System.out.println(objE.toString());

		System.out.println("salary before incrementing");
		System.out.println(objE.getSalary());
		System.out.println("Annual salary");
		System.out.println(objE.getAnnualSalary());
		System.out.println("Salary after increment");
		System.out.println(objE.raiseSalary(20));
		System.out.println("employee details are :" + objE.toString());
		// objE.getID();
		// objE.getName();
		// objE.getSalary();
		// objE.get
		objE.setSalary(60000);
		System.out.println("newsalary :" + objE.getSalary());
		System.out.println("Employee details are:");
		System.out.println(objE.toString());

	}

}
