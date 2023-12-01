package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		String record1 = "1001:akhil:5000:M";
		String record2 = "1002:akhil1:50001:M";
		String record3 = "1003:akhil2:50002:M";
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee employee = new Employee();
		String[] fields = record1.split(":");
		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpGender(fields[3].charAt(0));
		al.add(employee);
		employee = new Employee();
		fields = record2.split(":");
		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpGender(fields[3].charAt(0));
		al.add(employee);
		employee = new Employee();
		fields = record3.split(":");
		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpGender(fields[3].charAt(0));
		al.add(employee);
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			employee = itr.next();
			System.out.println(employee.getEmpNum() + "\t" + employee.getEmpName() + "\t" + employee.getEmpSalary()
					+ "\t" + employee.getEmpGender());
		}
	}
}
