package tryblock;

import java.util.Scanner;

//try,catch,finally.... try must be followed by either catch or finally.
public class Test {
	public static void main(String[] args) {
		System.out.println("Enter employee details");
		Scanner sc = new Scanner(System.in);
		int eno;
		String empName;
		Double empSalary;
		String empDept;
		while (true) {
			try {
				System.out.println("Enter employee number");
				String inputData = sc.nextLine();
				eno = Integer.parseInt(inputData);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enter numeric data");
				continue;
			}
		}
		System.out.println("Enter employee name");
		empName = sc.nextLine();
		while (true) {
			try {
				System.out.println("Enter employee Salary");
				String inputData = sc.nextLine();
				empSalary = Double.parseDouble(inputData);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enter numeric data");
				continue;
			}
		}
		System.out.println("Enter employee department");
		empDept = sc.nextLine();
		System.out.println("Details entered are");
		System.out.println(eno + "\t" + empName + "\t" + empSalary + "\t" + empDept);
		sc.close();
	}
}
