package deserial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(args[0]);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			if (o instanceof Employee) {
				Employee emp = (Employee) o;
				System.out.println(emp.getEmpDept() + emp.getEmpName() + emp.getEmpNum() + emp.getEmpSalary());
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
