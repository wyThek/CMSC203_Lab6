public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;
	private String accountNumber;

	public CheckingAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-10";
		super.setAccountNumber(accountNumber);
	}

	public boolean withdraw(double amount) {
		boolean complete = true;
		if (amount > getBalance()) {
			return complete = false;
		}
		if (amount + FEE > getBalance()) {
			return complete = false;
		}

		return super.withdraw(amount + FEE);
	}
}