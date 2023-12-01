package serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Persistence is permanently storing object to file.
//Static members are not serializable.
//If any data member is transient it will be ignore while serialization.
public class Persist {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(args[0]);
			oos = new ObjectOutputStream(fos);
			Employee employee = new Employee();
			employee.setEmpNum(1001);
			employee.setEmpName("one");
			employee.setEmpSalary(1000);
			employee.setEmpDept("dev");
			oos.writeObject(employee);

			employee = new Employee();
			employee.setEmpNum(1002);
			employee.setEmpName("two");
			employee.setEmpSalary(2000);
			employee.setEmpDept("testing");
			oos.writeObject(employee);

			employee = new Employee();
			employee.setEmpNum(1003);
			employee.setEmpName("three");
			employee.setEmpSalary(3000);
			employee.setEmpDept("admin");
			oos.writeObject(employee);
			oos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
