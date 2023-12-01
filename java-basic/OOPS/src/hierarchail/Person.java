package hierarchail;

public class Person {
	private int pid;
	private String name;
	private String gender;
	private int age;

	public void setData(int pid, String name, String gender, int age) {
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void display() {
		System.out.println(pid + "\t" + name + "\t" + gender + "\t" + age);
	}
}