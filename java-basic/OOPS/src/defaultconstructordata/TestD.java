package defaultconstructordata;

public class TestD {
	public static void main(String[] args) {
		DatabaseServer db = new DatabaseServer();
		System.out.println("Trying to connect");
		db.display();
		db.setDbHost("10.0.2.15");
		db.display();
		db.setDbUid("admin");
		db.setDbPasswd("passwordwithcaps");
		db.display();
		System.out.println("Current user : " + db.getDbName());
		System.out.println("Server location : " + db.getDbHost());
	}
}