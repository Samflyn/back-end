package defaultconstructor;

public class Employee {
	private int empNum;
	private String empName;
	private char empGender;
	private static int counter = 1234;
	private String empCompany;

	public Employee() {
		empNum = ++counter;
		empCompany = "Sailotech";
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

	public void display() {
		System.out.println(empNum + "\t" + empName + "\t" + empGender + "\t" + empCompany);
	}
}
