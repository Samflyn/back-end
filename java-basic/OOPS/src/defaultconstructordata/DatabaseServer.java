package defaultconstructordata;

public class DatabaseServer {
	private String dbHost;
	private String dbName;
	private String dbUid;
	private String dbPasswd;

	public DatabaseServer() {
		dbHost = "localhost";
		dbName = "deepweb";
		dbUid = "sam";
		dbPasswd = "samflyn";
	}

	public String getDbHost() {
		return dbHost;
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUid() {
		return dbUid;
	}

	public void setDbUid(String dbUid) {
		this.dbUid = dbUid;
	}

	public String getDbPasswd() {
		return dbPasswd;
	}

	public void setDbPasswd(String dbPasswd) {
		this.dbPasswd = dbPasswd;
	}

	public void display() {
		System.out.println("Server ip : " + dbHost);
		System.out.println("Database Name : " + dbName);
		System.out.println("User : " + dbUid);
		System.out.println("Password : " + dbPasswd);
	}
}
