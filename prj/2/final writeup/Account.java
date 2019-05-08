public class Account {

	int accountID = 0;
	String username = "";
	String password = "";
	static int bankAccNum = 0;
	
	public Account(String user, String pass, int bankAcc) {
		username = user;
		password = pass;
		bankAccNum = bankAcc;
	}
	
	public String getPass() {
		return password;
	}
	
	public String getUser() {
		return username;
	}

}
