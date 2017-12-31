import java.util.Arrays;

public class Bank_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank ref=new Bank(4,"Schnidel");
		
		System.out.println(ref);
		
		
		Bank Sparkasse=new Bank(777, "DiBa");
		IAccount[] acs = null; //Map<Long, IAccount> acs= null;
		Date dateOfBirth = new Date(28, 5, 1970);
		IPerson customer = new Person("Hans Wurst", dateOfBirth);
		IAccount newAccount = new SavingsAccount(customer, new Date(30, 12, 2015));
		IAccount newAccount1 = new SavingsAccount(customer, new Date(30, 12, 2015));
		IAccount newAccount2 = new SavingsAccount(customer, new Date(30, 12, 2015));
		newAccount.setAccountNo(12345);
		newAccount1.setAccountNo(22345);
		newAccount2.setAccountNo(32345);
		Sparkasse.addAccount(newAccount);
		Sparkasse.addAccount(newAccount1);
		Sparkasse.addAccount(newAccount2);
		
		Sparkasse.deleteAccount(newAccount1);
		
		
		System.out.println(Arrays.toString(Sparkasse.accounts));
		
		System.out.println(Arrays.toString(Sparkasse.sortieren));
		
	}

}
