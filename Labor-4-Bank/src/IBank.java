
public interface IBank {
	
	public void addAccount(IAccount newAccount);
	public void deleteAccount(IAccount account);
	public boolean transer(long fromAccountNumber, long toAccountNumber,float amount);
	

}
