
public class SavingsAccount extends Account {

	Date creationDate;
	Date fixDate;
	
	public void fixAccount(Date fixDate){
		
		this.fixDate=fixDate;
		
	}
	
	public SavingsAccount(IPerson owner, Date creationDate){
		
		setOwner(owner);
		this.creationDate=creationDate;
	}
	
	
	@Override
	public boolean deposit(float amount) {
		return false;
	
	
		
		
	
		
	}

	@Override
	public boolean withdraw(float amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
