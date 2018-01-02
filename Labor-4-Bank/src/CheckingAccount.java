
public class CheckingAccount extends Account {

	Date creationDate;
	float creditLimit = -1000;
	private boolean erlaubtZu;
	private boolean erlaubtVon;

	public CheckingAccount(IPerson owner, Date creationDate, float creditLimit) {

		setOwner(owner);
		this.creationDate = creationDate;
		this.creditLimit = creditLimit;

	}

	@Override
	public boolean deposit(float amount) {
		boolean checkDepositMerker = false;
		if (erlaubtVon==true) {

			this.balance = balance + amount;
			checkDepositMerker = true;
		}
		return checkDepositMerker;

	}

	@Override
	public boolean withdraw(float amount) {
		boolean checkWithdrawMerker = false;

		if (erlaubtZu==true) {

			balance = balance - amount;
			checkWithdrawMerker = true;
		}
		return checkWithdrawMerker;

	}

	public String toString() {

		String CheckingAcc = "Girokonto" + " || " + "Kreditlimit:" + creditLimit;

		return CheckingAcc;

	}

	@Override
	public boolean checkTransferToAcc(IAccount toAccount, float amount) {

		erlaubtVon = true;
		return erlaubtVon;
	}

	@Override
	public boolean checkTransferFromAcc(IAccount fromAccount, float amount) {

		if (balance - amount >= this.creditLimit) {

			erlaubtZu = true;
		} else {
			erlaubtZu = false;
		}
		return erlaubtZu;
	}
}
