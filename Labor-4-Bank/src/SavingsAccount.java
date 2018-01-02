
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
		Date constand=new Date(1,1,2010);
		
		if (this.creationDate.isBefore(constand)==false && this.fixDate==null && amount>0) {

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

	public boolean checkTransferToAcc(IAccount fromAccount, float amount) {

		Date constant = new Date(1, 1, 2010);

		if (this.getOwner() == fromAccount.getOwner() && fixDate == null && this.creationDate.isBefore(constant)) {

			erlaubtZu = true;

		} else {
			erlaubtZu = false;

		}
		return erlaubtZu;
	}

	public boolean checkTransferFromAcc(IAccount toAccount, float amount) {

		if (this.getOwner() == toAccount.getOwner() && this.balance - amount >= 0 && fixDate == null) {

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
