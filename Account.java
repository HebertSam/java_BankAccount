import java.util.Random;

public class Account {
	private String accountNumber;
	private double checkingBal;
	private double savingsBal;
	private static int numOfAccounts;
	private static double totalAmount;
	
	private String createNum() {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9"};
        String newStr = "";
        for (int i = 0; i < 10; i++){
            newStr += alphabet[new Random().nextInt(alphabet.length)];
        }
        return newStr;
	}
	public Account() {
		this.setAccountNumber(createNum());
		numOfAccounts++;
	}
	public Double getCheckingBal() {
		return checkingBal;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	private void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static double getNumOfAccounts() {
		return numOfAccounts;
	}
	private static void setNumOfAccounts() {
		numOfAccounts++;
	}
	public Double getSavingsBal() {
		return savingsBal;
	}
	public static double getTotalAmount() {
		return totalAmount;
	}
	public void addSavings(double amount) {
		this.savingsBal += amount;
		totalAmount += amount;
	}
	public void addChecking(double amount) {
		this.checkingBal += amount;
		totalAmount += amount;
	}
	public void withdrawCheck(double amount) {
		this.checkingBal -= amount;
		totalAmount -= amount;
	}
	public void withdrawSave(double amount) {
		this.savingsBal -= amount;
		totalAmount -= amount;
	}
	
}
