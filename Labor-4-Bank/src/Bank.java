
public class Bank implements IBank {

	protected IAccount[] accounts=new IAccount [0];
	protected int blz;
	protected String name;
	
	
	public Bank(int blz, String name){
	
		this.blz=blz;
		this.name=name;
		
		
	}
	
	public String toString(){
		
		return String.format("%d %s ",this.blz,this.name);
	
	}
	
	
	private boolean checkTransfer(IAccount fromAccount,IAccount toAccount,float amount){
		
		
		
		return true;
		
		
	}
	
	@Override
	public void addAccount(IAccount newAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(IAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean transer(long fromAccountNumber, long toAccountNumber, float amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
