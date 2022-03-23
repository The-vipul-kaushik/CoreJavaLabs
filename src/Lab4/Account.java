package Lab4;

public class Account {
	long accNum=0;
	double balance;
	Person accHolder;
	
	Account(double b)
	{
		this.balance=b;
		this.accNum=accNum+1;
		accNum++;
	}
	
	void deposit(double d)
	{
		this.balance+=d;
	}
	void withdraw(double d)
	{
		this.balance-=d;
	}
	double getBalance()
	{
		return this.balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
