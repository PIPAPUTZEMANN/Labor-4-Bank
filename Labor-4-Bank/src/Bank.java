
public class Bank implements IBank {
//git test
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

	public String toString() {

		return String.format("%d %s ", this.blz, this.name);

	}

	private boolean checkTransfer(IAccount fromAccount, IAccount toAccount, float amount) {

		return true;

	}

	@Override
	public void addAccount(IAccount newAccount) {

		boolean doppelterAccount = false;
		if (index >= accounts.length) {

			// zwischenspeichern in Buffer
			buffer = accounts;

			// accounts array vergr��ern
			accounts = new IAccount[buffer.length + 1];

			// Kopiere Buffer in neues Account Array
			System.arraycopy(buffer, 0, accounts, 0, buffer.length);

		}
		buffer = new IAccount[0];

		// �berpr�fung ob Kontonummer doppelt und ob Null drin steht
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccountNo() == newAccount.getAccountNo()) {

					doppelterAccount = true;
				}
			}
		}

		if (doppelterAccount == false) {
			index++;
			accounts[index-1] = newAccount;
		}

	}

	@Override
	public void deleteAccount(IAccount account) {

		int i;
		int u=0;
		sortieren=new IAccount[accounts.length];

		for (i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccountNo() == account.getAccountNo()) {
					index--;
					accounts[i] = null;

				}
			}

	}
		
		
		for(int o=0;o<sortieren.length;o++){
				if(accounts[o]!=null){
				
					
				sortieren[u++]=accounts[o];
				
			}}}
		
		
		
	

	@Override
	public boolean transfer(long fromAccountNumber, long toAccountNumber, float amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
