package Challenge078;

class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public void getBalance() {
		System.out.println("Your Balance is " + this.balance + "$");
	}

	public void depositMoney(double money) {
		if (money <= 0) {
			System.out.println("Invalid Deposit " + money + "$");
		} else {
			balance += money;
			System.out.println(money + "$ deposit");
		}
	}

	public void withdrawMoney(double money) {
		if (money <= 0 || balance <= 0) {
			System.out.println("Invalid Withdraw");
			return;
		} else if (balance >= money) {
			balance -= money;
		} else {
			money = balance;
			balance = 0;
		}
		System.out.println("Only " + money + "$ withdraw");
	}
}
