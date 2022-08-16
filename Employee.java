package week2day1;

public class Employee {
	public void employeeName(String Name) {
		System.out.println(Name);
	}
	public void employeeId(int Id) {
		System.out.println(Id);
	}
	public void employeeAddress(String Address) {
		System.out.println(Address);
	}
	public void employeeSalary(float Salary) {
		System.out.println(Salary);
	}
	public void employeeMobileNumber(long Mobilenumber) {
		System.out.println(Mobilenumber);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.employeeName("SANDY");
		emp.employeeId(5689);
		emp.employeeAddress("Theni");
		emp.employeeSalary(50625.23F);
		emp.employeeMobileNumber(9629690933L);
		
	}

}
