package Lab4;

class SavingsAccount extends Account{
	SavingsAccount(double b) {
		super(b);
	}

	final double minbal=5000.0;
	
	@Override
	void withdraw(double d)
	{
		if(this.getBalance()<minbal)
			System.out.println("Can't withdraw");
		else
		{
			System.out.println("Withdrawn successfully");
			this.balance-=d;
		}
	}
}
class CurrentAccount extends Account{
	CurrentAccount(double b) {
		super(b);
	}

	double OverDraftLimit=10000.0;
	
	@Override
	void withdraw(double d)
	{
		if(d>OverDraftLimit)
			System.out.println("Limit reached");
		else
		{
			System.out.println("Withdrawn successfully");
			this.balance-=d;
		}
	}
}

public class Ex1 {
	public static void main(String[] args) {
		
		Account smith = new Account(2000);
		Account kathy = new Account(3000);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println(smith.getBalance());
		System.out.println(kathy.getBalance());
		
	}
}
