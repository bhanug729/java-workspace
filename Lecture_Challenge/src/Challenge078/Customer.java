package Challenge078;

public class Customer {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("001", "Prashant Jain");
		account.depositMoney(100);
		account.getBalance();
		account.withdrawMoney(200);
		account.depositMoney(-40);
		System.out.println();
		
		account.withdrawMoney(90);
		account.withdrawMoney(0);
		
		System.out.println();
		account.depositMoney(100);
		account.withdrawMoney(10);
		account.getBalance();
	}
}
