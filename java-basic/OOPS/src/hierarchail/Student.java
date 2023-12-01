package hierarchail;

public class Student extends Person {
	String course;
	double feePaid;
	double feeDue;
	char grade;

	public void setData(int pid, String name, String gender, int age, String course, double feePaid, double feeDue,
			char grade) {
		setData(pid, name, gender, age);
		this.course = course;
		this.feePaid = feePaid;
		this.feeDue = feeDue;
		this.grade = grade;
	}

	public void display() {
		super.display();
		System.out.println(course + "\t" + feePaid + "\t" + feeDue + "\t" + grade);
	}
}