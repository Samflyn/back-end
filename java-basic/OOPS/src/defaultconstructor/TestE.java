package defaultconstructor;

public class TestE {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEmpName("Akhil");
		e1.setEmpGender('M');
		e2.setEmpName("Sammy");
		e2.setEmpGender('M');
		e1.display();
		e2.display();
	}
}
