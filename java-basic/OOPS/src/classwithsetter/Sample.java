package classwithsetter;

public class Sample {
	private int empnum;
	private String empname;
	private char gender;
	private int salary;
	private String stream;

	public void setEnpnum(int Empnum) {
		empnum = Empnum;
	}

	public void setEmpname(String Empname) {
		empname = Empname;
	}

	public void setGender(char Gender) {
		gender = Gender;
	}

	public void setSalary(int Salary) {
		salary = Salary;
	}

	public void setStream(String Stream) {
		stream = Stream;
	}

	public void display() {
		System.out.println("Rollnum: " + empnum + "\tName: " + empname + "\tGender: " + gender + "\tSalary: " + salary
				+ "\tStream:" + stream);
	}
}