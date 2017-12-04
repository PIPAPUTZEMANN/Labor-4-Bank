
public class Person implements IPerson {

	String name;
	Date dateOfBirth;
	
	
	public Person (String aName, Date aDateOfBirth){
		
		this.name=aName;
		setDateOfBirth(aDateOfBirth);
	}
	
	@Override
	public String getName() {
	
		return this.name;
	}

	@Override
	public void setName(String newName) {
		
		if(newName!=null || newName!=""){
			
			this.name=newName;
		}
		
	}

	@Override
	public Date getDateOfBirth() {
		
		return this.dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date newDateOfBirth) {
		
		if(newDateOfBirth.isValidDate(newDateOfBirth.day, newDateOfBirth.month, newDateOfBirth.year)==true){
			
			this.dateOfBirth=newDateOfBirth;
		}
		
	}
	
	
}
