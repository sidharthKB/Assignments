package maven_demo;

public class BankAccountepositoryImpl extends BankAccount implements BankAccountRepository{
BankAccount account;
public BankAccountepositoryImpl(BankAccount account) {
	super();
	this.account = account;
}

public double updateBalance(long accountId, double newBalance) {
	this.account.accountBalance=newBalance;
	return newBalance;
}


public double getAccountBalance(long accountId) {
	return account.accountBalance;
}

public double getBalance(long accountId) {
	// TODO Auto-generated method stub
	return 0;
}

}
