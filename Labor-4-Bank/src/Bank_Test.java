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
		
		SavingsAccount red=(SavingsAccount)newAccount;
		red.fixAccount(new Date (22,22,2022));
		
		
		IAccount newAccount1 = new SavingsAccount(customer, new Date(30, 12, 2015));
		
		SavingsAccount green= (SavingsAccount)newAccount1;
		green.fixAccount(new Date(11,11,2011));
		
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
		
		IPerson customer2=new Person("Gertrude Schnittlauchverführerin" , new Date(9,9,1999));
		IAccount neuerAccount=new CheckingAccount(customer2, new Date(6,6,1966), -1000);
		neuerAccount.setAccountNo(4);
		Sparkasse.addAccount(neuerAccount);
		
		System.out.println(Sparkasse);

		

	}

}
