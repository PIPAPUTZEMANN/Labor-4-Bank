
public interface IBank {
	
	public void addAccount(IAccount newAccount);
	public void deleteAccount(IAccount account);
	public boolean transfer(long fromAccountNumber, long toAccountNumber,float amount);
	

}
