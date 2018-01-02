
public class SavingsAccount extends Account {

	Date creationDate;
	Date fixDate;
	private boolean erlaubtZu;
	private boolean erlaubtVon;

	public void fixAccount(Date fixDate) {

		this.fixDate = fixDate;

	}

	public SavingsAccount(IPerson owner, Date creationDate) {

		setOwner(owner);
		this.creationDate = creationDate;
	}

	@Override
	public boolean deposit(float amount) {
		boolean geldEinzahlen = false;
		if (erlaubtZu == true) {

			geldEinzahlen = true;
			this.balance += amount;
		}
		return geldEinzahlen;
	}

	@Override
	public boolean withdraw(float amount) {
		
		boolean geldAbheben=false;
		
		if(erlaubtVon==true){
			
			geldAbheben=true;
			this.balance-=amount;
		}
		
		return geldAbheben;
	}

	public boolean checkTransferToAcc(IAccount toAccount, float amount) {

		Date constant = new Date(1, 1, 2010);

		if (this.getOwner() == toAccount.getOwner() && fixDate == null && this.creationDate.isBefore(constant)) {

			erlaubtZu = true;

		} else {
			erlaubtZu = false;

		}
		return erlaubtZu;
	}

	public boolean checkTransferFromAcc(IAccount fromAccount, float amount) {

		if (this.getOwner() == fromAccount.getOwner() && this.balance - amount >= 0 && fixDate == null) {

			erlaubtVon = true;

		} else {

			erlaubtVon = false;
		}
		return erlaubtVon;

	}
	
	public String toString(){
		
		String SavingAcc="Sparkonto";
		
		if(fixDate!=null){
			
			SavingAcc="Sparkonto"+" || " +"FixDate:"+fixDate;
			
		}
		
		return SavingAcc;
		
		
		
	}

}
