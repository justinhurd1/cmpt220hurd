public class Bank {
	static String bankName = "";
	static int bankAccountNumber = 0;
	static double bankBalance = 0;
	
	public Bank(String bname, int baccountID, double balance) {
		bankName = bname;
		bankAccountNumber = baccountID;
		bankBalance = balance;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public int getBankAccount() {
		return bankAccountNumber;
	}
	
	public double getBankBalance() {
		bankBalance -= Transaction.getTransactionPrice();
		System.out.println(bankBalance);
		return bankBalance;
	}

}
