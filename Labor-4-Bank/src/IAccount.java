
public interface IAccount {
	
	public boolean deposit(float amount);
	public boolean withdraw (float amount);	
	public IPerson getOwner();
	public void setOwner(IPerson newOwner);	
	public void setAccountNo(long newAccountNumber);	
	public long getAccountNo();	
	public float getBalance();
	

}
