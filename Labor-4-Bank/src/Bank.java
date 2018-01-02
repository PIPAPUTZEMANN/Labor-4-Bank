
public class Bank implements IBank {

	protected IAccount[] accounts;
	protected int blz;
	protected String name;
	protected IAccount[] buffer;
	protected int index = 0;
	IAccount[] sortieren;

	public Bank(int blz, String name) {

		this.blz = blz;
		this.name = name;
		this.accounts = new IAccount[0];

	}

	private boolean checkTransfer(IAccount fromAccount, IAccount toAccount, float amount) {
		boolean transferErlaubt;
		if (amount > 0 && fromAccount != toAccount && toAccount.checkTransferToAcc(fromAccount, amount) == true
				&& fromAccount.checkTransferFromAcc(toAccount, amount) == true) {

			transferErlaubt = true;

		} else {
			transferErlaubt = false;

		}
		return transferErlaubt;
	}

	@Override
	public void addAccount(IAccount newAccount) {

		boolean doppelterAccount = false;
		if (index >= accounts.length) {

			// zwischenspeichern in Buffer
			buffer = accounts;

			// accounts array vergrößern
			accounts = new IAccount[buffer.length + 1];

			// Kopiere Buffer in neues Account Array
			System.arraycopy(buffer, 0, accounts, 0, buffer.length);

		}
		buffer = new IAccount[0];

		// überprüfung ob Kontonummer doppelt und ob Null drin steht
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccountNo() == newAccount.getAccountNo()) {

					doppelterAccount = true;
				}
			}
		}

		if (doppelterAccount == false) {
			index++;
			accounts[index - 1] = newAccount;
		}

	}

	@Override
	public void deleteAccount(IAccount account) {

		int i;
		int u = 0;
		sortieren = new IAccount[accounts.length];

		for (i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccountNo() == account.getAccountNo()) {
					index--;
					accounts[i] = null;

				}
			}

		}

		for (int o = 0; o < sortieren.length; o++) {
			if (accounts[o] != null) {

				sortieren[u++] = accounts[o];

			}

		}
		accounts = sortieren;

		sortieren = new IAccount[0];

	}

	@Override
	public boolean transfer(long fromAccountNumber, long toAccountNumber, float amount) {

		boolean transfer = false;

		if (checkTransfer(accounts[getAccountbyAccountNo(fromAccountNumber)],
				accounts[getAccountbyAccountNo(toAccountNumber)], amount)==true) {

			accounts[getAccountbyAccountNo(fromAccountNumber)].withdraw(amount);
			accounts[getAccountbyAccountNo(toAccountNumber)].deposit(amount);

			transfer = true;
		} else {

			System.out.println("Transfer nicht möglich");

		}
		return transfer;

	}

	public String toString() {

		String Daten = "";

		for (int h = 0; h < accounts.length; h++) {

			Daten = Daten + "\nKontonummer:" + accounts[h].getAccountNo() + " || Konto-Besitzer:"
					+ accounts[h].getOwner().getName() + " || Geburtsjahr:" + accounts[h].getOwner().getDateOfBirth()
					+ " || Kontostand:" + accounts[h].getBalance() + " || Kontotyp:" + accounts[h];

		}

		return "BLZ:" + this.blz + " Bank:" + this.name + Daten;

	}

	public int getAccountbyAccountNo(long AccountNumber) {

		int res = 0;
		

		for (int y = 0; y < accounts.length; y++) {
			if (accounts[y] != null) {
				if (AccountNumber == accounts[y].getAccountNo()) {

					res = y;
				}

			}

		}
		return res;

	}

}
