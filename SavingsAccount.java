public class SavingsAccount extends BankAccount{
	private double rate = 2.5;
	private static int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public void postInterest() {
		double finalRent = (rate / (100 * 12));
		super.deposit(super.getBalance() * finalRent);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
}