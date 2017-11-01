
public class BankTest {
	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		
		account1.addChecking(300.00);
		account2.addSavings(500.00);
		account1.withdrawCheck(100.00);
		account2.withdrawSave(100.00);
		
		
		System.out.println(account1.getAccountNumber());
		System.out.println(Account.getTotalAmount());
		
	}

}
