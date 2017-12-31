
public class CheckingAccount extends Account {

	Date creationDate;
	float creditLimit=-1000;
	
	public  CheckingAccount(IPerson owner, Date creationDate, float creditLimit){
		
		setOwner(owner);
		this.creationDate=creationDate;
		this.creditLimit=creditLimit;
		
	}
	@Override
	public boolean deposit(float amount) {
		boolean checkDepositMerker=false;
		if(amount>0){
			
			this.balance=balance+amount;
			checkDepositMerker=true;
		}
		return checkDepositMerker;
		
	}

	@Override
	public boolean withdraw(float amount) {
		 boolean checkWithdrawMerker=false;
		
		 if(amount>0 && balance-amount>=this.creditLimit){
			 
			 balance=balance-amount;
			 checkWithdrawMerker=true;
		 }
		 return checkWithdrawMerker;
			 
		 
		
	}

}
