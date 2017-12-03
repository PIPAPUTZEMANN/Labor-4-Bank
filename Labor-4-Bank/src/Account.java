
public abstract class Account implements IAccount {
	
	protected IPerson owner;
	protected float balance = 0;
	protected long accountNumber;
	
	public IPerson getOwner(){		
		return this.owner;
	}
	
	public void setOwner(IPerson newOwner){
		this.owner = newOwner;
	}
	
	public void setAccountNo(long newAccountNumber){
		this.accountNumber = newAccountNumber;
	}
	
	public long getAccountNo(){
		return this.accountNumber;
	}
	
	public float getBalance(){
		return this.balance;
	}
	
	//<<abstract>>
	public abstract boolean deposit(float amount);	
	public abstract boolean withdraw(float amount);	

}
