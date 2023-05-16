import java.util.*;

class BankAccount {
	long accountnumber;
	String customername;
	double balance;

	public BankAccount(long accountnumber, String customername, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.customername = customername;
		this.balance = balance;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public String getCustomername() {
		return customername;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Available Balance: " + balance);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawal successfull");
			System.out.println("Available Balance after Withdrawal: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void display() {
		System.out.println("Account Number : " + accountnumber);
		System.out.println("Account Holder Name : " + customername);
		System.out.println("Account Balance : " + balance);
	}
}

class CheckingAccount extends BankAccount {
	double monthlyfee;

	
	public CheckingAccount(long accountnumber, String customername, double balance, double monthlyfee) {
		super(accountnumber, customername, balance);
		this.monthlyfee = monthlyfee;
	}

	public double getMontlyfee() {
		return monthlyfee;
	}

	@Override
	public void withdraw(double amount) {
		if (amount + monthlyfee <= balance) {
			balance = balance - (amount + monthlyfee);
			System.out.println("Amount withdrawn successfully");
			System.out.println("Available Balance : " + balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}

	}
	@Override
	public void display() {
		super.display();
		System.out.println("MonthlyFee : "+monthlyfee);
	}

}

class SavingsAccount extends BankAccount {
	double interestrate;
	public SavingsAccount(long accountnumber, String customername, double balance, double interestrate) {
		super(accountnumber, customername, balance);
		this.interestrate = interestrate;
	}
	public double getInterestrate() {
		return interestrate;
	}
	public void addInterest() {
		double interest=balance*(interestrate/100);
		balance=balance+interest;
		System.out.println("Interest Added Successfully to your account");
		System.out.println("Available Balance : "+balance);
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Interest Rate : "+interestrate);
	}

}

class CreditAccount extends BankAccount {
	double creditlimit;

	public CreditAccount(long accountnumber, String customername, double balance, double creditlimit) {
		super(accountnumber, customername, balance);
		this.creditlimit = creditlimit;
	}

	public double getCreditlimit() {
		return creditlimit;
	}
	@Override
	public void withdraw(double amount) {
		if((balance+creditlimit)>=amount) {
			balance=balance-amount;
			System.out.println("Amount Withdrawn Successfully");
			System.out.println("Available Balance :"+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	@Override
	public void display() {
		super.display();
		System.out.println("CreditLimit : "+creditlimit);
	}
	
}

public class Bank {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter AccountNumber");
		long an=s.nextLong();
		System.out.println("Enter Account Holder Name");
		String ahn=s.next();
		System.out.println("Enter Amount");
		double bal=s.nextDouble();
		BankAccount b=new BankAccount(an,ahn,bal);
		System.out.println("Enter the amount to deposit");
		double d=s.nextDouble();
		b.deposit(d);
		System.out.println();
		System.out.println("Enter the amount you want to withdraw");
		double wd=s.nextDouble();
		b.withdraw(wd);
		b.display();
		
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("Enter MonthlyFee");
		double mf=s.nextDouble();
		CheckingAccount ca=new CheckingAccount(an, ahn, bal, mf);
		System.out.println("Enter the Withdraw amount for Checking account");
		double wd1=s.nextDouble();
		ca.withdraw(wd1);
		ca.display();
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("Enter the intrest rate :");
	    double ir=s.nextDouble();
		SavingsAccount sa=new SavingsAccount(an, ahn, bal, ir);
		sa.addInterest();
		sa.display();
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("Enter the credit limit");
		double cl=s.nextDouble();
		CreditAccount ka=new CreditAccount(an, ahn, bal,cl);
		System.out.println("Enter the Withdraw amount for creditlimit");
		double c=s.nextDouble();
		ka.withdraw(c);
		ka.display();

	}

}
