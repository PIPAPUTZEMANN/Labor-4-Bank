import java.util.Arrays;

public class Bank_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bank ref=new Bank(4,"Schnidel");

		// System.out.println(ref);

		Bank Sparkasse = new Bank(777, "DiBa");

		IAccount[] acs = null; // Map<Long, IAccount> acs= null;

		Date dateOfBirth = new Date(28, 5, 1970);

		IPerson customer = new Person("Hans Wurst", dateOfBirth);
		
		Date dateOfBirth1 = new Date(22, 5, 1970);

		IPerson customer1 = new Person("Hansi Wurst", dateOfBirth1);


		IAccount newAccount = new SavingsAccount(customer1, new Date(30, 12, 2015));
		IAccount newAccount1 = new SavingsAccount(customer, new Date(30, 12, 2015));
		IAccount newAccount2 = new SavingsAccount(customer, new Date(30, 12, 2015));
		newAccount.setAccountNo(1);
		newAccount1.setAccountNo(2);
		newAccount2.setAccountNo(3);
		Sparkasse.addAccount(newAccount);
		Sparkasse.addAccount(newAccount1);
		Sparkasse.addAccount(newAccount2);

		//Sparkasse.deleteAccount(newAccount2);

		//System.out.println(Arrays.toString(Sparkasse.accounts));

		//System.out.println(Arrays.toString(Sparkasse.sortieren));
		
		System.out.println(Sparkasse);

		

	}

}
