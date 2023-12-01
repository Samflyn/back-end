package classwithsetter;

public class Test {
	public static void main(String[] args) {
		Sample employee = new Sample();
		employee.setEnpnum(1);
		employee.setEmpname("Sammy");
		employee.setGender('M');
		employee.setSalary(10000);
		employee.setStream("Sailotech");
		employee.display();
		employee.setSalary(20000);
		employee.display();
	}
}