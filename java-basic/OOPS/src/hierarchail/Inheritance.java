package hierarchail;

public class Inheritance {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("Student data");
		student.setData(1001, "abc", "male", 25, "java", 10000, 5000, 'A');
		student.display();
		Employee employee = new Employee();
		System.out.println("Employee Data");
		employee.setData(101, "Mohan", "Male", 40, "IT", 25000, "admin");
		employee.display();
	}
}