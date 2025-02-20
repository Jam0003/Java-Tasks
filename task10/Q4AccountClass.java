package task10;

public class Q4AccountClass {

	int balance;

	public Q4AccountClass() {
	}

	public Q4AccountClass(int balance) {
		this.balance = balance;
		System.out.println("Current account balance :" + balance);
	}

	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("Balance after withdrawal  :" + balance);
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Balance after deposit : " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4AccountClass objA = new Q4AccountClass(1000);
		objA.withdraw(100);
		objA.deposit(500);

	}
}
